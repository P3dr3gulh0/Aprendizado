public class Caneta {
    private String modelo;
    private String cor;
    private double ponta;
    private boolean tampada;

    public void tampar(){
        tampada = true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void destampar(){
        tampada = false;
    }
    public void rabiscar(){
        if(tampada == false){
            System.out.println(" Estou rabiscando!");
        }else{
            System.out.println(" Erro! Caneta tampada! \n Não posso rabiscar");
        }
    }
}
