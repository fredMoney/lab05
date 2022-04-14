package lab05.builder;

public class BuilderAutoturismElectric implements BuilderMasina {

    private AutoturismElectric auto;

    public BuilderAutoturismElectric() {
        auto = new AutoturismElectric();
    }

    @Override
    public void buildSasiu(String sasiu) {
        auto.setSasiu(sasiu);
    }

    @Override
    public void buildRoti(String roti) {
        auto.setRoti(roti);
    }

    @Override
    public void buildMotor(String motor) {
        auto.setMotor(motor);
    }

    @Override
    public void buildInterior(String interior) {
        auto.setInterior(interior);
    }

    public void buildTipIncarcator(String tipIncarcator) {
        auto.setTipIncarcator(tipIncarcator);
    }

    @Override
    public Masina getMasina() {
        return auto;
    }

    void buildIncarcator(String incarcator) {
        auto.setTipIncarcator(incarcator);
    }
}
