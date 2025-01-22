print("Sou um programa dedicado a informar se seu peso está ideal ou não.\n")
print("Por favor responda as perguntas com sinceridade\n")
peso = float(input(print("Qual seu Peso: \n")))
altura = float(input(print("Qual sua altura em metros: \n")))

massacorporal = peso/(altura*altura)
print("Sua massa corporal é: ", massacorporal)

if massacorporal<18.5:
  print("Você está abaixo do peso ideal.")
elif massacorporal == 18.5 and massacorporal < 25:
  print("Você está no peso ideal.")
elif massacorporal > 25 and massacorporal < 30:
  print("Você está acima do peso ideal.")
else:
  print("Você está com peso excessivo.")
