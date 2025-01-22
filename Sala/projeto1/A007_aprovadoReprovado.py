print("Sou um progrma de verificação de notas. \n")
nota1 = float(input(print("Digite a primeira nota: ")))
nota2 = float(input(print("Digite a segunda nota: ")))

media = (nota1 + nota2)/2

if media<7:
  print("Sua media foi de: ", media, " e você foi reprovado.")
else:
  print("Sua media foi de: ", media, " e você foi aprovado.")
