package com.mateussilva.java.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ribossomo {

    /*
     * Input: Fita de RNA mensageiro (RNAm) e Código Genético
     * Output: Cadeia de aminoácido
     * Teste: AUG.UGC.AAG.UCU.AGU.GAG.AAG.GUU.UAU.UUG.ACA.AAG.CAA.GAG.AUC.ACG.AUC.CAU.GUC.GGC.UUA.UAG
     * Fonte usada para encontrar as siglas dos aminoacidos: http://labs.icb.ufmg.br/lbcd/grupo4/simbol.html
    */

    public static void main(String[] args) {

        try {

            String RNA, cadeia = "";
            BufferedReader entrada = new BufferedReader(
                    new FileReader("ribossomo//src//com//mateussilva//resources//entrada(ribossomo).txt"));
            RNA = entrada.readLine();
            entrada.close();

            RNA = RNA.toUpperCase();
            RNA = RNA.replace(".", ""); // remove "." da string
            String codom = RNA.substring(0, 3);

            if (codom.equals("AUG")) {
                cadeia += "M";
                int j = 6, i = 3;
                while (j <= RNA.length() && !codom.equals("UAA") && !codom.equals("UAG") && !codom.equals("UGA")) {
                    codom = RNA.substring(i, j);
                    cadeia += replaceString(codom);
                    i+=3;
                    j+=3;
                }
            }

            BufferedWriter saida = new BufferedWriter(
                    new FileWriter("ribossomo//src//com//mateussilva//resources//saida(ribossomo).txt"));
            saida.write(cadeia);
            saida.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }

    private static String replaceString(String c) {
        String res = "";

        switch (c) {
            case "AUG" -> res = "M";
            case "UUU","UUC" -> res = "F";                          // Fen ou Phe  Fenilalanina
            case "UGG" -> res = "W";                                // Trp Triptofano (Triptofana)
            case "UAA","UAG","UGA" -> res = "ST";                   // stop
            case "UUA","UUG","CUU","CUC","CUA","CUG" -> res = "L";  // Leu Leucina
            case "AUU","AUC","AUA" -> res = "I";                    // Ile Isoleucina
            case "GUU","GUC","GUA","GUG" -> res = "V";              // Val Valina
            case "UCU","UCC","UCA","UCG" -> res = "S";              // Ser Serina
            case "CCU","CCC","CCA","CCG" -> res = "P";              // Pro Prolina
            case "ACU","ACC","ACA","ACG" -> res = "T";              // Tre ou Thr Treonina
            case "GCU","GCC","GCA","GCG" -> res = "A";              // Ala Alanina
            case "UAU","UAC" -> res = "Y";                          // Tir ou Tyr Tirosina
            case "CAU","CAC" -> res = "H";                          // His Histidina
            case "CAA","CAG" -> res = "Q";                          // Gln Glutamina (Glutamida)
            case "AAU","AAC" -> res = "N";                          // Asn  Asparagina
            case "AAA","AAG" -> res = "K";                          // Lis ou Lys Lisina
            case "GAU","GAC" -> res = "D";                          // Asp Aspartato (Ácido aspartico)
            case "GAA","GAG" -> res = "E";                          // Glu Glutamato (Ácido glutâmico)
            case "UGU","UGC" -> res = "C";                          // Cis ou Cys Cisteína
            case "AGU","AGC" -> res = "S";                          // Ser Serina
            case "CGU","CGC","CGA","CGG","AGA","AGG" -> res = "R";  // Arg Arginina
            case "GGU","GGC","GGA","GGG" -> res = "G";              // Gli ou Gly Glicina
        }
        return res;
    }

}