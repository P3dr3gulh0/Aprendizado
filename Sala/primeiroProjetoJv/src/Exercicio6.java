import java.util.Scanner;
public class Exercicio6 {
    public static void mediaNotas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vou varificar se você tirou a media, por favor me informe sua primeira nota: ");
        float nota1 = scanner.nextInt();
        System.out.println("Sua segunda nota: ");
        float nota2 = scanner.nextInt();
        System.out.println("A terceira nota: ");
        float nota3 = scanner.nextInt();

        float media = (nota1 + nota2 + nota3)/3;

        if(media >=6){
            System.out.println("Você passou com " + media + " pontos");
        }else {
            System.out.println("Você não passou, ficou abaixo da media com " + media + " pontos");
        }


    }
}
//Desenvolva um programa que peça ao usuário três notas, calcule a média e informe
//se o aluno está aprovado (média ≥ 6) ou reprovado.