public class Caes {
    public String nome;
    public int peso;
    public String corOlhos;
    public String raca;
    public int quantPatas;

    public void imprimir(){
        System.out.println("\n Nome: " + nome + "\n Peso: " + peso + "Kg\n Cor dos Olhos: " + corOlhos + "\n Raça: " + raca + "\n Quantidade de Patas: "+ quantPatas);
    }
    public void latir(){
        System.out.println("Au! Au!");
    }
}