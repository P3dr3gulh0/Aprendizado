programa {
  funcao inicio() {
    cadeia numero

    escreva("Me informe um numero para que eu converta em um dia da semana: ")
    leia(numero)

    escolha(numero){
      caso "1": 
      escreva("É domingo")
      pare

      caso "2": 
      escreva("É segunda-feira")
      pare

      caso "3": 
      escreva("É terça-feira")
      pare

      caso "4": 
      escreva("É quarta-feira")
      pare

      caso "5": 
      escreva("É quinta-feira")
      pare

      caso "6": 
      escreva("É sexta-feira")
      pare

      caso "7": 
      escreva("É sabado")
      pare

      caso contrario:
      escreva("Não é valido")
    }
  }
}
