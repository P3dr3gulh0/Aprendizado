programa {
  funcao inicio() {
    real lado,medida, atriangulo, aquadrado, apentagono

    escreva("Me diga quantos lados tem seu poligono: ")
    leia(lado)

    escreva("Considere que trabalho com centimentros, qual a medida do lado? ")
    leia(medida)

    se(lado == 3){
      atriangulo = (medida*medida)/2
      escreva("Seu poloigono é um triangulo com ", atriangulo, "cm de area")
    }
    senao se(lado == 4){
      aquadrado = medida*medida
      escreva("Seu poligo é um quadrado com ", aquadrado, "cm de area")
    }
    senao se(lado == 5){
      apentagono = lado*5*lado/2
      escreva("Seu poligo é um pentagono com ", apentagono, "cm de area")
    }
    senao{
      escreva("Não deu certo, começe de novo.")
    }
  }
}
