senhaCorreta = 131313
senhaimput = int(input("Para continuarmos os procedimentos, precisamos conferir sua permissão, Por favor, digite uma senha: "))

while senhaimput != senhaCorreta:
    senhaimput=int(input("Senha Incorreta! Tente novamente: "))

print("Senha correta, vamos continuar...")
    