
diegoAntonio = 0
jocenitoMedeiros = 0 
milenaSantos = 0
vanderleyOrvalho = 0
votoBranco = 0
parar = "s"
cont = 1
while parar == "s":
    print("\nOlá votante ", cont, ", aqui está o menu de votação:")
    voto = int(input("\n 1. Candidato Diego Antônio\n 2. Candidato Jocenito Medeiros\n 3. Candidata Milena Santos\n 4. Candidato Vanderley Orvalho\n 5. Voto em Branco\n 6. Informações\n 7. Finalizar\n Digite o numero de uma das opções: "))
    match voto:
        case 1: 
            diegoAntonio + 1
        case 2:
            jocenitoMedeiros + 1
        case 3:
            milenaSantos + 1
        case 4:
            vanderleyOrvalho + 1
        case 5:
            votoBranco + 1
        case 6:
            print("Essas são as informações sobre a eleição até agora:\n 1. Candidato Diego Antônio: ", diegoAntonio, "\n 2. Candidato Jocenito Medeiros: ",jocenitoMedeiros,"\n 3. Candidata Milena Santos: ",milenaSantos,"\n 4. Candidato Vanderley Orvalho: ", vanderleyOrvalho, "\n 5. Voto em Branco ", votoBranco, "\n")
            parar = input("Digite s para continuar: ")
        case 7:
            parar = "n"