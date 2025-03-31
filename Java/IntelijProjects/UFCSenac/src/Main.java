public class Main {
    public static void main(String[] args) {

        Lutador lutador1 = new Lutador("Roksten", "Brasil", 21, 1.81, 84);

        Lutador lutador2 = new Lutador("Vitão", "Brasil", 21, 1.70, 60);

        Luta luta1 = new Luta();

        luta1.marcarluta(lutador1, lutador2);

//        lutador1.apresentar();
//        lutador2.apresentar();
        luta1.lutar(lutador1, lutador2);
        lutador1.status();
        lutador2.status();
    }
}
