package model;

public class ImprovedSimCard extends SimpleSimCard {

    private String puk;

    public ImprovedSimCard(String serialNumber, String pin, String puk) {
        super(serialNumber, pin);
        this.puk = puk;
    }

    @Override
    public String toString() {
        return "improvedSimCard{" +
                super.toString() +
                "puk='" + puk + '\'' +
                '}';
    }

    @Override
    public void enterSim(String pin) {
        if (this.isActive()) {
            super.enterSim(pin);
        }else{
            System.out.println("már csak puk koddal tudsz belépni");
            if (pin.equals(puk)) {
                setActive(true);
                setPinTry(0);
            }
        }

    }

    public ImprovedSimCard() {
        super();
        this.puk = generate(8);
    }
}
