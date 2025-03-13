import java.util.Scanner;

public class Exercicio7 {
    public static void fatorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um numero para que eu veja o fatorial deste: ");
        int numero = scanner.nextInt();
        int fatorando = 1;
        for(int i = 1; i <= numero; i++) {
            fatorando *= i;
        }
        System.out.println(fatorando);;
        scanner.close();
    }
}
//Peça ao usuário um número inteiro positivo e calcule o fatorial desse número.