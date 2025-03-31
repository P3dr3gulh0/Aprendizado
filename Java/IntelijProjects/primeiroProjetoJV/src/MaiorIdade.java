import java.util.Scanner;

public class MaiorIdade {
        public static void idademaior(){
                Scanner scanner = new Scanner(System.in);


                System.out.println("Digite seu nome: ");
                String nome = scanner.next();

                System.out.println("Agora digite sua idade: ");
                int idade = scanner.nextInt();

                if(idade >= 18){
                        System.out.println("Olá, " + nome + " Você está na maior idade.");
                }
                else{
                        System.out.println("Olá," + nome + " Você está na menor idade.");
                }

                scanner.close();
        }
}
