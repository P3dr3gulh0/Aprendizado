import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 100;

        do{
            System.out.print("Escolha uma das opções: \n");
            System.out.print(" 1 - Ex01(Algoritimo)\n 2 - Ex02(Somas)\n 3 - Ex03(Par ou Impar)\n 4 - Ex04(Tabuada)\n 5 - Ex05(Sequencia)\n 6 - Ex06(Media de Notas)\n 7 - Ex07(Fatorial)\n 8 - Ex08(Numero primo)\n 9 - Ex09(Jogo de Adivinhação)\n 10 - Ex10(Palavra invertida)\n --> ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 0 -> System.exit(0);
                case 1 -> Exercicio1.aLGORITIMO();
                case 2 -> Exercicio2.soma();
                case 3 -> Exercicio3.positivoNegativo();
                case 4 -> Exercicio4.tabuada();
                case 5 -> Exercicio5.sequencia();
                case 6 -> Exercicio6.mediaNotas();
                case 7 -> Exercicio7.fatorial();
                case 8 -> Exercicio8.numeroPrimo();
                case 9 -> Exercicio9.jogoDeAdivinhacao();
                case 10 -> Exercicio10.palavrainvertida();
            }
        }while(opcao != 0);
    scanner.close();
    }
}