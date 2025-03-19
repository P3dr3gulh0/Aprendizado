//Crie um programa que peça ao usuário um número inteiro e informe se ele é par ou
//ímpar.

import java.util.Scanner;

public class Exercicio3{
    public static void positivoNegativo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero(inteiro) para que eu o identifique como par ou impar: ");
        int numero = scanner.nextInt();
        int verificador = numero % 2;
        if(verificador == 0){
            System.out.println("O "+ numero+ " é um numero par");
        }else {
            System.out.println("O " +numero+ " é um numero impar");
        }
    }

}
