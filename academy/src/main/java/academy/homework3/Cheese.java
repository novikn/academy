package main.java.academy.homework3;



public class Cheese extends Product {
    private String type;
    public Cheese(String name, String type, double quantity, double price) {
        super(name, quantity, price);
        this.type = type;
    }

    public Cheese() {
        super();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDiscount() {
        return 0.8;  //20%
    }
}
