opcao= int(input("Bem vindo!, no sua conta há o valor de R$600,00. Ações disponiveis:\n 1 - Deposito.\n 2 - Saque.\n Qual delas deseja fazer? "))
valor = float(input("Qual valor deseja movimentar?"))

match opcao:
    case 1:
        print("O valor R$",valor," foi depositado.")
    case 2:
        if valor <= 600:
            print("Realizando o saque")
        else:
            print("Valor digitado é maior que o saldo da conta.")
    case _:
        print("Opção invalida. Reinicie o programa.")