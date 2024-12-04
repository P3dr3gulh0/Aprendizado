programa {
  funcao inicio() {
    /*3. Desenvolva um algoritmo para uma conta bancária, leia o tipo de operação
    a ser realizada (depósito ou saque) e o valor a ser depositado ou sacado. 
    Considere que um saque só pode ser realizado caso haja saldo suficiente. 
    Ao final de cada operação, exiba o saldo existente. 
    Saldo inicial de R$600,00 reais.
    */
    cadeia opcao
    real valor

    escreva("Bem vindo!, no sua conta há o valor de R$600,00. Ações disponiveis:\n1-Deposito.\n2-Saque.\n Qual delas deseja fazer? ")
    leia(opcao)
    limpa()
    escreva("Qual valor da movimentação? ")
    leia(valor)
    limpa()
    escolha(opcao)
    {
      caso "1":
        escreva("Valor de ", valor," foi depositado!")
      pare

      caso "2":
        se(valor > 600)
        {
          escreva("Valor digitado é maior do que o saldo da conta. Reinicie o programa.")
        }
        senao
        {
          escreva("Certo, aqui está o dinheiro.")
        }
        pare

      caso contrario:
        escreva(" Recomece o programa.")
    }
  }
}
