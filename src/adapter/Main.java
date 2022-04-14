package lab05.adapter;

public class Main {
    public static void main(String[] args) {
        JucarieMobila jucarie = new AutoturismToMasinaJucarieAdapter();
        JucarieMobila actualJucarie = new MasinaJucarie();

        jucarie.emiteSunete();
        actualJucarie.emiteSunete();
    }
}
