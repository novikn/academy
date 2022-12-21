package main.java.academy.Class8;

public class Bread  extends Product{

    public Bread(String name,double price ,double quantity ) {
        super(name, price, quantity);
    }
    public Bread(){

    }
    public double getDiscount(){
        double v = 0.8;
        return v;
    }

}
