programa {
  funcao inicio() {
    inteiro quantidade
    real promo1, promo2

    escreva("Quantas maçãs deseja hoje? ")
    leia(quantidade)

    promo1 = 0.30
    promo2 = 0.25

    se(quantidade < 12)
    {
      escreva("Cada maça custará, 30 centavos, a quantidade de maças que pediu custará: ", quantidade*promo1)
    }
    senao{escreva("Cada maça custará, 25 centavos, a quantidade de maças que pediu custará: ", quantidade*promo2)}
  }
}
