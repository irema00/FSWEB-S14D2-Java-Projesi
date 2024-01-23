package model;

public class Lamp {
    // private instance variables
    private final LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery(){
        return this.battery;
    }

    public int getGlobRating(){
        return this.globRating;
    }
}