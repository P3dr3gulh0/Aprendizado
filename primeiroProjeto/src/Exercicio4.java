import java.util.Scanner;

public class Exercicio4 {
    public static void tabuada(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me informe um numero para que eu te mostre a tabuada dele: ");
        int numero = scanner.nextInt();

        for(int operador = 1; operador <= 10; operador++){
            System.out.println(numero + "*" + operador + "=" +numero * operador);

        }
        scanner.close();
    }
}
