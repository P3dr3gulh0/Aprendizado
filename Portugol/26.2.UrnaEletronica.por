/*2. Faça um programa que simule uma urna eletrônica de uma eleição. A tela a ser apresentada deverá ser da seguinte forma: As opções são:

1. Candidato Diego Antônio
2. Candidato Jocenito Medeiros
3. Candidata Milena Santos
4. Candidato Vanderley Orvalho
5. Voto em Branco
6. Informações
7. Finalizar

O programa deverá ler os votos dos eleitores e, quando for inserido o número 6, apresentar as seguintes
informações:
a) O número de votos de cada candidato;
b) O número de votos brancos;
c) O candidato que está vencendo.

Quando for inserido o número 7, o programa deve finalizar.
*/

programa {

  inclua biblioteca Util --> u
  funcao inicio() {
    
    inteiro votos, instrucao, diegoAntonio=0, jocenitoMedeiros=0, milenaSantos=0, vanderleyOrvalho=0, votoBranco=0, cont=1
    cadeia pausar
  faca{

    escreva("\nOlá votante ", cont, ", aqui está o menu de votação:")
    escreva("\n 1. Candidato Diego Antônio\n 2. Candidato Jocenito Medeiros\n 3. Candidata Milena Santos\n 4. Candidato Vanderley Orvalho\n 5. Voto em Branco\n 6. Informações\n 7. Finalizar\n Digite o numero de uma das opções: ")
    leia(instrucao)
    limpa()
    cont++
    escolha(instrucao){
      caso 1: 
      escreva("\nSeu voto foi direcionado ao candidato Diego.")
      diegoAntonio++
      u.aguarde(2000)
      pare

      caso 2: 
      escreva("\nSeu voto foi direcionado ao candidato Jocenito.")
      jocenitoMedeiros++
      u.aguarde(2000)
      pare

      caso 3:
      escreva("\nSeu voto foi direcionado ao candidato Milena.")
      milenaSantos++
      u.aguarde(2000)
      pare

      caso 4:
      escreva("\nSeu voto foi direcionado ao candidato Vanderley.")
      vanderleyOrvalho++
      u.aguarde(2000)
      pare

      caso 5:
      escreva("\nSeu voto foi em branco. ")
      votoBranco++
      u.aguarde(2000)
      pare

      caso 6:
      limpa()
      escreva("Essas são as informações sobre a eleição até agora:\n 1. Candidato Diego Antônio: ", diegoAntonio, "\n 2. Candidato Jocenito Medeiros: ",jocenitoMedeiros,"\n 3. Candidata Milena Santos: ",milenaSantos,"\n 4. Candidato Vanderley Orvalho: ", vanderleyOrvalho, "\n 5. Voto em Branco ", votoBranco, "\n")
      u.aguarde(4000)
      limpa()
      se(diegoAntonio > jocenitoMedeiros e diegoAntonio > milenaSantos e diegoAntonio > vanderleyOrvalho){
        escreva("Diego é o vencedor dessa votação!!")
      }senao se(jocenitoMedeiros > diegoAntonio e jocenitoMedeiros > milenaSantos e jocenitoMedeiros > vanderleyOrvalho){
        escreva("Jocenito é o vencedor dessa votação!")
      }senao se(milenaSantos > diegoAntonio e milenaSantos > jocenitoMedeiros e milenaSantos > vanderleyOrvalho){
        escreva("Milena é a Vencedora dessa votação!!")
      }senao se(vanderleyOrvalho > diegoAntonio e vanderleyOrvalho > jocenitoMedeiros e vanderleyOrvalho > milenaSantos){
        escreva("Vanderlei é o vencedor dessa votação!!")
      }
      u.aguarde(4000)
      escreva("\nEnter para voltar a votação.")
      leia(pausar)
      limpa()
       pare


    }
  }enquanto(instrucao != 7)
  
  }
}
