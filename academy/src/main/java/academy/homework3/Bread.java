package main.java.academy.homework3;

public class Bread extends Product {
    private String type;

    public Bread(String name, String type, double price, double quantity) {
        super(name, price, quantity);
        this.type = type;
    }

    public Bread() {
        super();
    }

    @Override
    public double getDiscount() {
        if (quantity > 3) {
            return 0.9;
        } else {
            return 1;
        }
    }
}
