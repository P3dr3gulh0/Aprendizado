programa {
  funcao inicio() {
    cadeia nome, end, numTel

    escreva("Para começar as interaçoes, precisamos de algumas informações.", "\n", "Qual seu nome? ", "\n")
    leia(nome)

    escreva("Agora preciso de seu endereço: ", "\n")
    leia(end)

    escreva("Por ultimo me informe o seu numero de telefone: ", "\n")
    leia(numTel)
    
    escreva("Verifique se as informações estão corretas:", "\n", "Seu nome é, ", nome, " e você mora na rua, ", end, " para te contactar usaremos o telefone, ", numTel)
  }
}
