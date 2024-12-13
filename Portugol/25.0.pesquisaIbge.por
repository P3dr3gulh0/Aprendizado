/*1. Foi feita uma pesquisa entre os habitantes de uma região. Foram
coletados os dados de idade, sexo (M/F) e salário. Faça um programa
que calcule e mostre:
a) A média dos salários do grupo;
b) A maior e a menor idade do grupo;
c) A quantidade de mulheres na região;
d) A idade e o sexo da pessoa que possui o menor salário;
Finalize a entrada de dados ao ser digitado algum comando para
encerrar.
*/


programa {
  funcao inicio() {
    inteiro idade, iMaior = 0, iMenor = 9999, quantPessoas, cont = 0, quantF = 0, menorSalario = 0, idadeMenorSalario = 0
    real salario, mediaSalario, somaSalario = 0
    cadeia sexo, sexoMenorSalario

    escreva("Sou um programa de pesquisa, por favor me indique quantas pessoas serão pesquisadas: ")
    leia(quantPessoas)

    faca{
      escreva("Okay, pessoa ",cont+1, ". Pode me informas sua: \n")
      escreva("Qual sua idade? ")
      leia(idade)
        se(idade>iMaior){
          iMaior = idade
        }
        se(idade<iMenor){
          iMenor = idade
        }
      escreva("Qual seu sexo?(M/F): ")
      leia(sexo)
        se(sexo == "F" ou sexo =="f"){
          quantF++
        }
      escreva("Quanto você ganha? ")
      leia(salario)
        se(salario<menorSalario){
          menorSalario = salario
          idadeMenorSalario = idade
          sexoMenorSalario = sexo
        }
      limpa()
      somaSalario = somaSalario + salario
      cont++
    }enquanto(cont < quantPessoas)

    escreva("A media de salario entre essas pessoas é: ",somaSalario/quantPessoas, "\n")
    escreva("A menor idade desse grupo é ", iMenor, " e, a maior idade é ", iMaior, ".\n")
    escreva("A quantidade de mulheres nessa região é: ", quantF ,"\n")
    escreva("A pessoa com menor salario ", salario ," tem a idade de ",idade, " e é do sexo ", sexo, ".")
  }
}
