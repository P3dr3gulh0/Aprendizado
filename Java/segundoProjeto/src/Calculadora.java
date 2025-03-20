import java.util.Scanner;

public class Calculadora {
    public static  double soma(double v1, double v2){
        double total = v1 = v2;
        return total;
    }
    public static double subtracao(double v1, double v2){
        double total = v1 - v2;
        return total;
    }
    public static double multiplicacao(double v1, double v2){
        double total = v1 * v2;
        return total;
    }
    public static double  divisao(double v1, double v2){
        double total = v1 / v2;
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double valor1 = scanner.nextDouble();
        System.out.println("Digite outro numero: ");
        double valor2 = scanner.nextDouble();

        System.out.println("Soma: " + soma(valor1,valor2));
        System.out.println("Subtração: " + subtracao(valor1,valor2));
        System.out.println("Multiplicação: " + multiplicacao(valor1,valor2));
        System.out.println("Divisão: " + divisao(valor1,valor2));
    }
}
