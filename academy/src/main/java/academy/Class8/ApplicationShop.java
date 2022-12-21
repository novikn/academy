package main.java.academy.Class8;

public class ApplicationShop {
    public static void main(String[] args) {


        Product bread1 = new Bread("Багет", 1.7, 5);
        System.out.println(bread1);
        System.out.println(bread1.calcPrice());
    }
}