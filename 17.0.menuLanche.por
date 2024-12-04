programa {
  funcao inicio() {
    /*1. Escreva um algoritmo que leia o código do item adquirido pelo consumidor 
    e a quantidade, calculando e mostrando o valor a pagar. Não será necessário
    exibir o produto e o valor, somente o valor final. O programa deverá apresentar 
    uma tela de entrada com as seguintes opções:*/

    cadeia opcao
    real quantidade

    escreva("Menu de Opçoes da lanchonete do Codigo Mineiro.\n")
    escreva(" 1 - Cachorro quente = R$ 10,70 \n 2- Bauru Simples = R$ 5,30 \n 3- Bauru com ovo = R$ 7,60\n 4 - Hambúrguer = R$ 18,40\n 5 - Cheeseburguer = R$ 20,50\n 6 - Refrigerante = R$ 6,00\n O que deseja? ")
    leia(opcao)

    escreva("Quantos você deseja? ")
    leia(quantidade)

    escolha(opcao){
      caso "1":
      escreva("Então será ", quantidade, " de Cachorro quente, o valor total: ", quantidade*10.70)
      pare
      
      caso "2":
      escreva("Então será ", quantidade, " de Bauru Simples, o valor total: ", quantidade*5.30)
      pare

      caso "3":
      escreva("Então será ", quantidade, " de Bauru com ovo, o valor total: ", quantidade*7.60)
      pare
      
      caso "4":
      escreva("Então será ", quantidade, " de Hambúrguer, o valor total: ", quantidade*18.40)
      pare

      caso "5":
      escreva("Então será ", quantidade, " de Cheeseburguer, o valor total: ", quantidade*20.60)
      pare

      caso"6":
      escreva("Então será ", quantidade, " de Refrigerante, o valor total: ", quantidade*6.00)
      pare
      caso contrario:
      escreva("Opção Invalida, recomeçe o programa.")
    }

  escreva("\nOkay, logo voltaremos com seu pedido.")
  }
}
