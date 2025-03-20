import java.util.Scanner;

public class Volume {
    public static double calculo(double r, double h){
        double v = 3.14159 * (r * r) * h;
        return v;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para calcular a área de seu cilindo, digite o falor do raio(cm): ");
        double r = scanner.nextDouble();
        System.out.println("Preciso também da altura de seu cilindro(cm): ");
        double h = scanner.nextDouble();

        System.out.println("A área é: " + calculo(r,h));
    }
}
