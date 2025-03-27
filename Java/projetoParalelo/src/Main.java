import java.util.Scanner;

public class Main {

    public static void roleta(){
        Scanner scanner = new Scanner(System.in);
        String parar = "n";
        System.out.println("Olá! Fui criado para sortear um nome dentro de uma lista de pessoas.\nPor favor, insira a quantidade de pessoas que participarão do sorteio: ");
        int i = scanner.nextInt();
        String[] pessoa = new String[i];
        do{

            System.out.print("Adicione um nome para o sorteio: ");
            pessoa[i] = scanner.next();
            System.out.print("Adicionar uma pessoa(s/n)? ");
            parar = scanner.next();
            System.out.println(i);
            System.out.println(pessoa[i]);
            i++;

        }while(parar.equals("s") || parar.equals("S"));


    }

    public static void main(String[] args) {
        roleta();
    }
}
