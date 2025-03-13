import java.util.Scanner;

//Escreva um algoritmo que leia o número de vezes que se deseja imprimir a
//palavra "ALGORITMOS" e imprimir.
public class Exercicio1{
    public static void aLGORITIMO(){
        Scanner scanner = new Scanner(System.in);
        int cont2 = 0;
        System.out.println("Digite a quantidade de vezes que 'ALGORITIMO' deverá aparecer.");
        int cont1 = scanner.nextInt();

        while (cont1 != cont2){
            System.out.println("ALGORITMO");
            cont2 ++;
        }
        scanner.close();
    }
}
