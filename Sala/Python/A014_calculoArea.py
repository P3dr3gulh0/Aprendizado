print("Sou um program que identifica sua figura e calculo sua area. Apenas com figuras de lados igual.\n")

lado = float(input("\n Quantos lados tem seu poligono?\n "))
medida = float(input("\n Qual valor do lado da seu poligono(cm)?\n "))

if lado == 3:
    area = (medida*medida)/2
    print("Sua poligono é um Triangulo e possui ", area," cm³.")
elif lado == 4:
    area = medida*medida
    print("Sua poligono é um quadrado e possui ", area, " cm³.")
elif lado == 5: 
    area = (medida*medida*5)/2
    print("Sua poligono é um pentagono e tem ", area, "cm³.")
else:
    print("O poligo não é identificado . Por favor reinicie o codigo.")

