anoNascimento = int(input("Digite o ano do seu nascimento: "))
anoAtual = int(input("Digite o ano atual: "))

idade = anoAtual - anoNascimento

if idade >= 16:
  print("Você pode votar esse ano.")
else: 
  print("Você não pode votar esse ano.")