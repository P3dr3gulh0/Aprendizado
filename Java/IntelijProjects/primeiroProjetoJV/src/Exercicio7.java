import java.util.Scanner;

public class Exercicio7 {
    public static void fatorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um numero para que eu veja o fatorial deste: ");
        int numero = scanner.nextInt();
        int fatorial = 1;
        for(int i =1; i<=numero;i++){
            fatorial *=i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

    }
}
//Peça ao usuário um número inteiro positivo e calcule o fatorial desse número.