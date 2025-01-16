/*1. Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados de idade, sexo (M/F) e salário. Faça um programa que calcule e mostre:

a) A média dos salários do grupo;
b) A maior e a menor idade do grupo;
c) A quantidade de mulheres na região;
d) A idade e o sexo da pessoa que possui o menor salário;

Finalize a entrada de dados ao ser digitado algum comando para encerrar.
*/



programa {
  funcao inicio() {
    real salario, idade, cont=0, somaSalario=0, mediaSalario=0, maior, menor, menorIdade = 9999, maiorIdade = 0, quantF = 0, menorSalario =  149600000, idadeMenorSalario
    cadeia parar = "S", sexo, sexoMenorSalario

    faca{
      escreva("Olá! Sou seu programa auxiliar de entrevistas, estou aqui guardar as informações das pessoas e então responder a quatro perguntas especifica! Vamos começar com a primeira pessoa!\n")
      limpa()
      escreva("Qual sua idade? ")
      leia(idade)
      escreva("Qual seu sexo? ")
      leia(sexo)
      se(sexo == "f" ou sexo == "F")
        {
        sexo = "Feminino"
        }
      senao
      {
        sexo = "Masculino"
      }

      escreva("Qual seu salario? ")
      leia(salario)
      limpa()

      cont++
      se(salario > 0)
      {
      somaSalario = salario + somaSalario
      mediaSalario = somaSalario / cont
      }

      se(idade > maiorIdade)
      {
        maiorIdade = idade
      }
      se(idade < menorIdade)
      {
        menorIdade = idade
      }

      se(sexo == "F" ou sexo == "f")
      {
        quantF++
      }

      se(salario < menorSalario){
        menorSalario = salario
        idadeMenorSalario = idade
        sexoMenorSalario = sexo
      }

      escreva("Mais uma intrevista(S/N)? ")
      leia(parar)
      limpa()
    }enquanto(parar == "S" ou parar == "s")
  
    
    escreva("\nA media de salario na região é: ", mediaSalario)
    escreva("\nA maior idade do grupo é ", maiorIdade, " e a menor é ", menorIdade, ".")
    escreva("\nA quantidade de pessoas do sexo feminino é: ", quantF)
    escreva("\nA pessoa que recebe o menor salario tem ", idadeMenorSalario, " anos e também tem ", sexoMenorSalario, " como sexo.")
    escreva("\nO numero de pessoas entrevisadas é: ", cont)

  }
}
