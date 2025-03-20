gols1 = int(input("Sou um programa util para dizer qual time ganhou o jogo!\n Por favor me diga quantos gols o primeiro time fez:\n"))
gols2 = int(input("E o segundo time? \n"))

if gols1 > gols2:
    print("O primeiro time ganhou o jogo!")
elif gols1 < gols2:
    print("O segundo time ganhou o jogo!")
else:
    print("Foi um jogo equilibrado.")