quantNotas = int(input("Faço calculo para saber a sua media de notas, por favor me infome quantas notas são: "))
cont = 0
soma = 0
valorNota = 0
while cont < quantNotas:
    cont+=1
    valorNota = int(input("Qual o valor da nota: "))
    soma +=valorNota
mediaNotas = soma/quantNotas
print("Sua media de nota é: ", mediaNotas,".")