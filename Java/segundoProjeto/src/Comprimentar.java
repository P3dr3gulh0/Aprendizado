import java.util.Scanner;

public class Comprimentar {
    public static int comparacao(int hora){
        if(hora>=0000 && hora<=0600){
            System.out.println("Boa madrugada!");
        } else if (hora>0600 && hora<1200){
            System.out.println("Bom dia!");
        } else if (hora>1200 && hora<1800){
            System.out.println("Boa tarde!");
        }else if(hora>=1800 && hora<0000){
            System.out.println("Boa noite!");
        }else{
            System.out.println("Horario invalido");
        }
        return hora;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sou criado com modos de comprimentar meus usuarios, por favor informe o horario em formato militar: ");
        int hora = scanner.nextInt();

        comparacao(hora);
    }
}
