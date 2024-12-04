programa {
  funcao inicio() {
    real numero1, numero2

    escreva("Escreva um numero:")
    leia(numero1)

    escreva("Escreva outro numero:")
    leia(numero2)

    se(numero1 < numero2)
    {
      escreva( numero2, " é maior que ", numero1)
    }
    senao{escreva(numero1, " é maior que ", numero2)}
  }
}
