public class Estudante {

    private String nome;
    private int idade;
    private int matricula;
    private String endereco;

    public Estudante(String nome, int idade, int matricula, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void estudar(){
    }

    public void realizarAtividade(){
    }

    public void sofre(){
    }

    public void realizaProvas(){
    }

    public void imprimir(){
        System.out.println("\n Nome: " + getNome() +"\n Idade: " + getIdade() + "\n Matricula: " + getMatricula() + "\n Endereço: " + getEndereco());

    }
}
