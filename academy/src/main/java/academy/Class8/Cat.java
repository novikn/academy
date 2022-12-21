package main.java.academy.Class8;

public class Cat {
    private String nickname;
    private  int age;
    public static double money;

    public static double getMoney() {
        return money;
    }

    public static void setMoney(double money) {
        Cat.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
