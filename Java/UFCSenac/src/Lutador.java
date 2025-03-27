import javax.swing.*;

public class Lutador {
    private String nome;
    private String nascionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nascionalidade, int idade, double altura, double peso) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria( String categoria) {
        if (peso <= 52) {
            this.categoria = "Peso invalido";
        } else if (peso <= 70) {
            this.categoria = "Peso Leve";
        } else if (peso <= 83) {
            this.categoria = "Peso Medio";
        } else if (peso <= 110) {
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Invalido";
        }

    }


    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar() {
        JOptionPane.showMessageDialog(null, "Senhoras e senhores, está na hora!\n Apresentamos diretamente de " + getNascionalidade() + " com " + getIdade() + " anos de idade, medindo " + getAltura() + "m de altura e pesando " + getPeso() + "kg!\n Competindo na categoria " + getCategoria() + ", com um cartel de " + getVitorias() + " vitórias, " + getDerrotas() + " derrotas e " + getEmpates() + " empates!\n Apresentamos... " + getNome() + "!");
    }

    public void status() {
        JOptionPane.showMessageDialog(null, "Resultados do lutador: \n " + getVitorias() + " Vitorias \n " + getDerrotas() + " Derrotas\n " + getEmpates() + " Empates");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empateLuta() {
        setEmpates(getEmpates() + 1);
    }
}
