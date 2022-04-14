package lab05.builder;

public class InginerAuto {
    private BuilderMasina b;
    private String tip;

    public InginerAuto(String tipMasina) {
        this.tip = tipMasina;
        if(tipMasina.toLowerCase().equals("electrica")) {
            b = new BuilderAutoturismElectric();
        } else if(tipMasina.toLowerCase().equals("clasica")) {
            b = new BuilderAutoturismClasic();
        } else {
            throw new IllegalArgumentException();
        }
    }

    private void buildMasina(String sasiu, String motor, String interior, String roti) {
        b.buildSasiu(sasiu);
        b.buildMotor(motor);
        b.buildInterior(interior);
        b.buildRoti(roti);
    }

    public Masina getMasina(String sasiu,String motor,String interior,String roti) {
        this.buildMasina(sasiu, motor, interior, roti);
        return b.getMasina();
    }
}
