package lab05.adapter;

public class AutoturismToMasinaJucarieAdapter implements JucarieMobila {

    private Masina autoturism;

    public AutoturismToMasinaJucarieAdapter() {
        autoturism = new Autoturism();
    }

    @Override
    public void seDeplaseaza() {
        autoturism.ruleaza();
    }

    @Override
    public void emiteSunete() {
        autoturism.claxoneaza();
    }
}
