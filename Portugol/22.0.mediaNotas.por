/*3. Crie um programa para ler N notas e mostrar a média delas.*/

programa {
  funcao inicio() {

    real quantNotas, notas, soma = 0, mediaNotas, cont = 0

    escreva("Para tirarmos a sua media, precisamos saber quantas atividades avaliativas possuí, quantas são? ")
    leia(quantNotas)

    enquanto(cont < quantNotas){
      cont++
      escreva("Qual o valor da atividade ", cont, "? ")
      leia(notas)
      limpa()
      soma = soma+notas
    }

    mediaNotas = soma/quantNotas
    escreva("A media de suas notas é: ", mediaNotas)
    
  }
}
