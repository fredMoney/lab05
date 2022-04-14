package lab05.adapter;

public class MasinaJucarie implements JucarieMobila {

    @Override
    public void seDeplaseaza() {
        System.out.println("0.5 km/h");
    }

    @Override
    public void emiteSunete() {
        System.out.println("*beep boop* (jucarie)");
    }
}
