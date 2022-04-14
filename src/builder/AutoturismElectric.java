package lab05.builder;

public class AutoturismElectric implements Masina {

    private String sasiu;
    private String roti;
    private String motor;
    private String interior;
    private String tipIncarcator;

    public AutoturismElectric() {
        System.out.println("S-a construit un autoturism electric.");
    }

    @Override
    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    @Override
    public void setRoti(String roti) {
        this.roti = roti;
    }

    @Override
    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setTipIncarcator(String tipIncarcator) {
        this.tipIncarcator = tipIncarcator;
    }

    @Override
    public void accelereaza() {
        System.out.println("vroom. (electric)");
    }
}
