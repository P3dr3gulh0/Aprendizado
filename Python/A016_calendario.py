mes = int(input("Me fale um numero para que eu o interprete como um mês:\n"))

match mes:
    case 1:
        print("Seu mês é Janeiro!")
    case 2: 
        print("Seu mês é Fevereiro!")
    case 3:
        print("Seu mês é Março!")
    case 4: 
        print("Seu mês é Abril!")
    case 5: 
        print("Seu mês é Maio!")
    case 6: 
        print("Seu mês é Junho!")
    case 7: 
        print("Seu mês é Julho!")
    case 8: 
        print("Seu mês é Agosto!")
    case 9: 
        print("Seu mês é Setembro!")
    case 10: 
        print("Seu mês é Outubro!")
    case 11: 
        print("Seu mês é Novembro!")
    case 12: 
        print("Seu mês é Dezembro!")
    case _:
        print("Esse numero não pode ser representado como um mês")