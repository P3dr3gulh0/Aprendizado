import java.util.Random;
import java.util.Scanner;

public class Exercicio9 {
    public static void jogoDeAdivinhacao(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numero = random.nextInt(101);
        boolean acertou = false;

        while (!acertou){
            System.out.println("Vamos para um jogo de adivinhação, sorteei um numero, e você terá de adivinha-lo. Primeira tentativa: ");
            int tentativa = scanner.nextInt();

            if(tentativa < numero){
                System.out.println("Errou! O numero é maior. Tente de novo: ");
            }else if(tentativa > numero){
                System.out.println("Errou! O numero é menor. Tente de novo: ");
            }else{
                System.out.println("Acertou! Parabens!!");
                acertou = true;
            }
        }
        scanner.close();
    }
}
//Desenvolva um jogo onde o programa gera um número aleatório entre 1 e 100 e o
//usuário deve adivinhar. O programa deve dar dicas se o número inserido for maior
//ou menor.