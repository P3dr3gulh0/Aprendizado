programa {
  funcao inicio() {
    inteiro gols1, gols2

    escreva("Pode me dizer o resoltado do jogo, quantos gols o time da casa fez? ")
    leia(gols1)
    
    escreva("E o time visitante? ")
    leia(gols2)

    se(gols1 > gols2){
      escreva("A casa ganhou!")
    }
    senao se(gols1 < gols2){
      escreva("O visitante conquistou a vitoria!")
    }

    senao{
      escreva("Um jogo equilibrado!")
    }
  }
}
