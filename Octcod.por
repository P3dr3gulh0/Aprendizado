programa {
  funcao inicio() {
    inteiro nascimentoAno, atualAno, idade


    escreva("qual sua data de nascimento? ")
    leia(nascimentoAno)

    escreva("E qual o ano atual? ")
    leia(atualAno)

    idade = atualAno - nascimentoAno
    escreva("Então sua idade é ", idade, " ,")

    se(idade >= 18){
      escreva(" você já pode votar!")
    }
  }
}
