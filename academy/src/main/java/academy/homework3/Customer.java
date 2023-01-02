package main.java.academy.homework3;

public class Customer extends Person {
    public Customer(String name, double money) {
        super(name, money);
    }

    @Override
    public String toString() {
        return "Данные покупателя: \n" +
                "имя: " + name +
                "\nкошелек: " + money;
    }
}
