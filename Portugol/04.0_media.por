programa {
  funcao inicio() {
    real n1, n2, n3, media

    escreva("Vamos fazer uma media sobre alguns numeros", "\n", "Digite um numero: ")
    leia(n1)

    escreva("Digite outro numero: ")
    leia(n2)

    escreva("Digite mais um numero: ")
    leia(n3)

    media = (n1+n2+n3/3)
    escreva("Então a media entre eles é igual a: ", media)
  }
}
