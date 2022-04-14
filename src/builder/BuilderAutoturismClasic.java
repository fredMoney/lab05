package lab05.builder;

public class BuilderAutoturismClasic implements BuilderMasina{

    private AutoturismClasic auto;

    public BuilderAutoturismClasic() {
        auto = new AutoturismClasic();
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

    public void buildAditivi(String aditivi) {
        auto.setAditivi(aditivi);
    }

    @Override
    public Masina getMasina() {
        return auto;
    }
}
