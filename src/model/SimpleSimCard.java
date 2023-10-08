package model;

import java.util.Random;

public class SimpleSimCard {

    private String serialNumber;
    private String pin;
    private boolean active;

    private int pinTry = 0;

    public int getPinTry() {
        return pinTry;
    }

    public void setPinTry(int pinTry) {
        this.pinTry = pinTry;
    }

    @Override
    public String toString() {
        return "SimpleSimCard{" +
                "serialNumber='" + serialNumber + '\'' +
                ", pin='" + pin + '\'' +
                ", active=" + active +
                '}';
    }

    public SimpleSimCard(String serialNumber, String pin) {
        this.serialNumber = serialNumber;
        this.pin = pin;
        this.active = true;
    }

    public SimpleSimCard() {
        this.serialNumber = generate(16);
        this.pin = generate(4);
        this.active = true;
    }

    protected String generate(int digit) {
        Random r = new Random();
        StringBuilder serial = new StringBuilder();
        for (int i = 0; i < digit; i++) {
            serial.append(r.nextInt(10));
        }
        return serial.toString();
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void enterSim(String pin) {
        if (this.pinTry < 3) {
            if (pin.equals(this.pin)) {
                System.out.println("sikeres pin megadás!");
                this.pinTry = 0;
                }else {
                this.pinTry++;
            }

            }else{
            System.out.println("a Sim tiltva van már nem fogad pin-t");
            this.active = false;
        }

    }
}
