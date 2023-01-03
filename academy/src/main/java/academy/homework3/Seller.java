package main.java.academy.homework3;

import java.time.LocalDate;

public class Seller extends Person {

    public Seller(String name, double money) {
        super(name, money);
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        super.setDateOfBirth(dateOfBirth);
    }

    @Override
    public String toString() {
        return "Данные продавца: \n" +
                "имя: " + name +
                "\nкошелек: " + money;
    }
}
