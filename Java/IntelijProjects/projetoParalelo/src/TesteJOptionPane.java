import javax.swing.*;

public class TesteJOptionPane {
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog(null, "Digite o primeiro valor");

        String numero2 = JOptionPane.showInputDialog(null, "Digite o segundo valor");

        double n1 = Double.parseDouble(numero1);
        double n2 = Double.parseDouble(numero2);

        double resultado = n1 + n2;

        JOptionPane.showMessageDialog(null, "Total: " + resultado);

    }
}
