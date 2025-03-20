import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
         procuraParOuImpar(numero);
    }

    public static void procuraParOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Esté numero é par!");
        } else {
            System.out.println("Esté numero é impar!");
        }
    }
}

