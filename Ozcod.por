programa {
  funcao inicio() {
    inteiro numero1, numero2, divisao
    
    numero2 = 2
    escreva("Me informe um numero: ")
    leia(numero1)

    divisao = numero1 % numero2

    se(divisao == 0){
      escreva("ele é par")
    }
    senao{escreva("ele é impar")}
  }
}
