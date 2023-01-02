package main.java.academy.homework3;

public class Wine extends Product {
    private double volume;
    public Wine() {
        super();
    }

    public Wine(String name, double volume, double price, double quantity) {
        super(name, price, quantity);
        this.volume = volume;
    }

    @Override
    protected double getDiscount() {
        return 0.95;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
