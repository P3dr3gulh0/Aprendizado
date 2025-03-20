
continuar = "S"
cont = 0
salario = 1
SomaSalario = 0.0
mediaSalario = 0.0
menorSalario = 149600000
sexo = 0
sexoMenorSalario = 1
qtnfeminino = 0
idade = 0
maioridade = 0
menoridade = 9999
idadeMenorSalario = 0

print("Começando uma entrevista.")

while continuar == "s" or continuar == "S":
    idade = int(input("Qual a idade do(a) entrevistado(a)? "))
    sexo = str(input("Qual a sexo do(a) entrevistado(a)? "))
    #Facilitação do print futuro.
    if sexo == "F" or sexo == "f":
        sexo = "Feminino"
    else:
        sexo = "Masculino"

    salario = float(input("Qual o salario? "))
    cont +=1

    #Media de salario
    if salario > 0:
        SomaSalario = salario + SomaSalario
        mediaSalario = SomaSalario/cont

    #maior e menor idade
    if idade > maioridade:
        maioridade = idade
    if idade < menoridade:
        menoridade = idade

    #quantidade de mulheres

    if sexo == "f" or sexo == "F":
        qtnfeminino += 1

    #Idade e Sexo do menor salario

    if menorSalario > salario:
        menorSalario = salario
        idadeMenorSalario = idade
        sexoMenorSalario = sexo

    continuar = str(input("Começar uma entrevista?(S/N) "))

print("A media de salario do grupo intrevistado é: ", mediaSalario)
print("A maior idade do grupo é: ", maioridade, "\n E a menor é:", menoridade)
print("A quantidade de mulheres na região.", qtnfeminino)
print("O menor salario é R${}0 a pessoa com esse salario tem {} anos e é genero {}".format(menorSalario, idadeMenorSalario, sexoMenorSalario))

    