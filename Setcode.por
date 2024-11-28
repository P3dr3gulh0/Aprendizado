programa {
  funcao inicio() {
    real not1, not2, media

    escreva("Me deixe ver a sua media de notas", "\n", "Qual sua primeira nota: ")
    leia(not1)

    escreva("E a Segunda? ")
    leia(not2)
    
    media = (not1+not2)/2
    escreva("Essa é sua media: ", media)

    se(media<7){
      escreva("\n", "Reprovado")
    }
    senao{escreva("\n", "Aprovado")
    }

  }
}
