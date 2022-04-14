package lab05.adapter;

public class Autoturism implements Masina {

    @Override
    public void ruleaza() {
        System.out.println("100 km/h");
    }

    @Override
    public void claxoneaza() {
        System.out.println("*clonk!* (masina)");
    }
}
