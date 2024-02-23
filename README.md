# Transcrição de RNA para Cadeia de Aminoácidos

Este programa Java recebe uma fita de RNA mensageiro (RNAm) e o código genético correspondente para traduzi-lo em uma cadeia de aminoácidos. A entrada é lida de um arquivo específico e a cadeia de aminoácidos resultante é escrita em um arquivo de saída.

## Funcionalidade

- **Input:** O programa espera uma sequência de RNA mensageiro (RNAm) contendo o código genético.
- **Output:** Gera uma cadeia de aminoácidos correspondente à sequência de RNAm.
- **Teste de Exemplo:** `AUG.UGC.AAG.UCU.AGU.GAG.AAG.GUU.UAU.UUG.ACA.AAG.CAA.GAG.AUC.ACG.AUC.CAU.GUC.GGC.UUA.UAG`

## Uso

1. Assegure-se de ter um arquivo de entrada contendo a sequência de RNA mensageiro (RNAm) no formato desejado.
2. Execute o programa.
3. Verifique o arquivo de saída para obter a sequência correspondente de aminoácidos.

## Detalhes Técnicos

- O programa inicia a tradução a partir do códon de iniciação "AUG" e termina quando encontra um dos códons de parada "UAA", "UAG" ou "UGA".
- A tradução é realizada de acordo com o código genético padrão.
- O programa utiliza uma tabela de correspondência entre os códons de RNA e os aminoácidos para realizar a tradução.
- A sequência de RNA é lida de um arquivo de entrada e a cadeia de aminoácidos resultante é escrita em um arquivo de saída.

## Arquivos do Projeto

- **Ribossomo.java:** Contém o código-fonte do programa.
- **entrada(ribossomo).txt:** Arquivo de entrada que contém a sequência de RNA mensageiro (RNAm) e o código genético.
- **saida(ribossomo).txt:** Arquivo de saída onde será gravada a cadeia de aminoácidos resultante da tradução.