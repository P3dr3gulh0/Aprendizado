//Escreva um programa que solicite dois números inteiros ao usuário, realize a soma e
//exiba o resultado.

import java.util.Scanner;

public class Exercicio2{
    public static void soma(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vou somar dois numeros inteiros para você. \n Me fale o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Agora o segundo numero: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero1;

        System.out.println("A soma de "+numero1 + " mais " + numero2 + "é igual a " + soma);

        scanner.close();
    }
}
