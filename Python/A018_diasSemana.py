numero = int(input("Escolha um numero para que tal seja convertido em um dia da semana: "))
match numero:
    case 1:
        print("É domingo")
    case 2:
        print("É segunda-feira")
    case 3:
        print("É terça-feira.")
    case 4:
        print("É quarta-feira.")
    case 5:
        print("É quinta feira")
    case 6:
        print("É sexta-feira")
    case 7:
        print("É sábado")
    case _:
        print("Não pode ser convertido. Reinicie o codigo.")