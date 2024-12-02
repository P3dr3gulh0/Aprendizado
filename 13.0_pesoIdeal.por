programa {
  funcao inicio() {
    real peso, altura, massaCorpo

    escreva("Vamos fazer uma analise corporal, qual seu peso? ")
    leia(peso)

    escreva("Agora me diga sua altura em metros: ")
    leia(altura)

    massaCorpo = peso/(altura*altura)
    escreva(massaCorpo)

    se(massaCorpo < 18.5)
    {
      escreva("Você está abaixo do peso.")
    }
    senao se(massaCorpo == 18.5 e massaCorpo <= 25)
    {
      escreva("\n Está dentro dos esperados")
    }
    senao se(massaCorpo < 25 e massaCorpo <= 30)
    {
      escreva("\n Acima do peso")
    }
    senao
    {
      escreva("\nEstá com peso excessivo")
    }
  }
}
