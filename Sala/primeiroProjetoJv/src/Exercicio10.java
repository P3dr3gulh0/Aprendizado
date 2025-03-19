import java.util.Scanner;

public class Exercicio10 {
    public static void palavrainvertida(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escreva um palavra que vou te mostar como ela fica ao invertida: ");
        String palavra = scanner.next();
        StringBuilder strBui = new StringBuilder(palavra);

        strBui.reverse();
        System.out.println(strBui);

    }
}
//Peça ao usuário para inserir uma palavra e exiba essa palavra ao contrário