import java.util.Scanner;

public class Exercicio8 {
    public static void numeroPrimo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro para verificar se é primo ou não: ");
        int numero = scanner.nextInt();
        boolean primo = true;
        for(int i = 2; i < numero / 2; i++){
            if(numero % i ==0){
                primo = false;
            }
        }
        if(primo && numero!= 1){
            System.out.println("O número é primo.");
        }else{
            System.out.println("O número é primo");
        }

    }
}
//Crie um programa que determine se um número fornecido pelo usuário é primo ou
//não