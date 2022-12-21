package main.java.academy.Class8;

public class Cheese extends Product {
    public Cheese(String name, int quantity, int price) {
        super(name, quantity, price);
    }

    public Cheese() {
    }

    public  double getDiscount() {
        return 0.8;  //20%
    }
}
