/*5. Escreva um programa em portugol que repita a leitura de uma
senha até que ela seja válida. Para cada leitura de senha incorreta
informada, escrever a mensagem “Senha Inválida”. Quando a senha
for informada corretamente deve ser impressa a mensagem “Acesso
Permitido” e o programa deve ser encerrado. Considere que a senha
correta é o valor 131313.*/

programa {
  funcao inicio() {
    inteiro senhaCorreta = 131313, senhaUsuario

    escreva("Para continuarmos os procedimentos, precisamos conferir sua permissão, Por favor, digite uma senha: ")
    leia(senhaUsuario)

    enquanto(senhaUsuario != senhaCorreta){
      escreva("Senha Incorreta! Tente novamente: ")
      leia(senhaUsuario)
    }
    escreva("Senha correta, vamos continuar...")
  }
}
