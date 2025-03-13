import java.util.Scanner;

public class Exercicio8 {
    public static void numeroPrimo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro para verificar se é primo ou não: ");
        int numero = scanner.nextInt();

        scanner.close();
    }
}
//Crie um programa que determine se um número fornecido pelo usuário é primo ou
//não