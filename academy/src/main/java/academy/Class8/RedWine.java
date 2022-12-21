package main.java.academy.Class8;

public class RedWine extends Wine {
    String property;

    public RedWine(String name, double price, double quantity, String property) {
        super(name, price, quantity);
        this.property = property;
    }

    public String getProperty() {
        return property;
    }
}
