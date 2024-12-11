/*1. Crie um programa que imprima 11 vezes a frase “Diego e um
professor incrível!" utilizando uma estrutura sequencial e uma
estrutura de repetição enquanto(while).*/

programa {
  funcao inicio() {

    cadeia nome = "Diego"
    inteiro cont = 0

    enquanto(cont < 11){
      cont++
      escreva("\n", cont)
      escreva("\nDiego")
    }

  }
}
