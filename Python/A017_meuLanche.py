print("Cardapio da lanchonete Codigo Mineiro:")

opcao = int(input(" 1 - Cachorro quente = R$ 10,70 \n 2 - Bauru Simples = R$ 5,30 \n 3 - Bauru com ovo = R$ 7,60\n 4 - Hambúrguer = R$ 18,40\n 5 - Cheeseburguer = R$ 20,50\n 6 - Refrigerante = R$ 6,00\n Escolha digitando um numero correspondente: "))

quantidade = int(input("\nQual a quantidade? "))

match opcao:
    case 1:
        print("Então será ", quantidade, " de Cachorro quente, o valor total: ", quantidade*10.70)
    case 2:
        print("Então será ", quantidade, " de Bauru Simples, o valor total: ", quantidade*5.30)
    case 3:
        print("Então será ", quantidade, " de Bauru com Ovo, o valor total: ", quantidade*7.60)
    case 4:
        print("Então será ", quantidade, " de Hambúrgues, o valor total: ", quantidade*18.40)
    case 5:
        print("Então será ", quantidade, " de Cheeseburguer, o valor total: ", quantidade*20.50)
    case 6:
        print("Então será ", quantidade, " de Refrigerante, o valor total: ", quantidade*6.00)
    case _:
        print("Escolha invalida, reinicie o programa!")
    