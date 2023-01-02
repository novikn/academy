package main.java.academy.Class8;

public class Bread extends Product {

    public Bread(String name, double price, double quantity) {
        super(name, price, quantity);
    }

    public Bread() {

    }

    public double getDiscount() {
        if (quantity > 3) {
            return 0.9;
        } else {
            return 1;
        }

    }

}
