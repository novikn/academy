package main.java.academy.homework3;

public class Seller extends Person {

    public Seller(String name, double money) {
        super(name, money);
    }

    @Override
    public String toString() {
        return "Данные продавца: \n" +
                "имя: " + name +
                "\nкошелек: " + money;
    }
}
