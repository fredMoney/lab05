package lab05.builder;

public class Main {
    public static void main(String[] args) {
        InginerAuto inginerE = new InginerAuto("electrica");
        InginerAuto inginerC = new InginerAuto("clasica");

        Masina masina = inginerE.getMasina("normal", "puternic", "spatios", "Michelin");
        masina.accelereaza();

    }
}
