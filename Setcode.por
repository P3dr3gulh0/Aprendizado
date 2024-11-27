programa {
  funcao inicio() {
    real nota1, nota2, media

    escreva("Me deixe ver a sua media de notas", "\n", "Qual sua primeira nota: ")
    leia(nota1)

    escreva("E a Segunda? ")
    leia(nota2)
    
    media = (nota1+nota2)/2
    escreva("Essa é sua media: ", media)

    se(media<7){
      escreva("\n", "Reprovado")
    }
    senao{escreva("\n", "Aprovado")
    }

  }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 159; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */