package main.java.academy.Class8;

public abstract  class Product {
    private double price;
    protected String name;
    public double quantity;

    public Product() {

    }

    public Product(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public Product(String name, double price, double quantity) {
        this(name, price);
        this.quantity = quantity;
    }

    public double calcPrice() {
        return price * quantity;
    }
protected abstract double getDiscount();
    public double calcFinalPrice(){
        return quantity*price*getDiscount();
   // public double discount() {
      //  return 1;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
