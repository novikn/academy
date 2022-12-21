package main.java.academy.Class8;

public class Wine extends Product{

    public Wine(String name, double price, double quantity) {
        super(name, price, quantity);
    }

    @Override
    protected double getDiscount() {
        return 0;
    }

}
