import javax.swing.*;
import java.util.Scanner;

public class Testes {

    public static void atividade1(){
        int[] numeros = {2,2,2,2};
        numeros[0] = 3;
        numeros[1] = 4;
        numeros[2] = 7;
        numeros[3] = 5;
        for(int i = 0; i <= 3; i++){
            numeros[i] += 4;
            System.out.println(numeros[i]);
//Crie um vetor de 4 posições
//inicializados com valor 2 em cada
//uma das posições.
//• Atribua os valores 3,4,7,5 a cada
//posição do vetor, respectivamente,
//um a um.
//• Percorra o vetor somando 4 ao
//valor armazenado em cada posição.
//• Imprima o vetor com valores
//atualizados, um valor por linha.
        }
    }
    public static void atividade2() {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        for (int i = 0; i <= 9; i++) {
            System.out.println("Escreva um numero para a lista: ");
            numeros[i] = sc.nextInt();

        }
        sc.close();
        for (int j = 9; j >= 0; j--) {
            System.out.println(numeros[j]);
        }
//Faça um programa que peça ao
//usuário para digitar 10 números reais.
//Ao final imprima cada valor na ordem
//inversa à leitura.

    }

    public static void testes () {
    }

    public static void main (String[]args){
                testes();
//    atividade1();
//    atividade2();
    }
}
