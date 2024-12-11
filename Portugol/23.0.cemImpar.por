/*4. Escreva um aplicativo em portugol que mostre todos os números
ímpares de 1 até 100*/

programa {
  funcao inicio() {

    inteiro cont = 0, par = 2, contImpar

    enquanto(cont<100){
      cont++
      contImpar = cont % par
      se(contImpar != 0){
      escreva("\n", cont)
      }
    }
  }
}
