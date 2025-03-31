import javax.swing.*;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarluta(Lutador lutador1, Lutador lutador2) {
        if (lutador1.getCategoria() == lutador2.getCategoria() && lutador1.getNome() != lutador2.getNome()) {
            JOptionPane.showMessageDialog(null, "A Luta entre " + lutador1.getNome() + " e " + lutador2.getNome() + " foi aprovada!");
            aprovada = true;
        } else {
            JOptionPane.showMessageDialog(null, "A Luta entre " + lutador1.getNome() + " e " + lutador2.getNome() + " foi reprovada!");
            aprovada = false;
        }

    }

    public void lutar(Lutador lutador1, Lutador lutador2) {
        Random random = new Random();

        if (getAprovada() == true) {
            int aleatorio1 = random.nextInt(5);
            int aleatorio2 = random.nextInt(5);
            System.out.println("Mostrando numeros: \nAleatorio1 = " + aleatorio1 + "\nAleatorio2 = " + aleatorio2 );
            if (aleatorio1 > aleatorio2) {
                lutador1.setVitorias(1);
                lutador2.setDerrotas(1);
            } else if (aleatorio1 < aleatorio2) {
                lutador1.setDerrotas(1);
                lutador2.setVitorias(1);
            } else {
                lutador1.setEmpates(1);
                lutador2.setEmpates(1);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Sem luta!");
        }

    }

}
