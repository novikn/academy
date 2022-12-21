package main.java.academy.Class8;

import org.jetbrains.annotations.NotNull;

public class Magazine implements Printable{
    private String name;
    int month;

    public Magazine() {
    }

    public Magazine(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public void print() {
        System.out.println("Magazine" + name + month);
    }
    public static void printBook(Printable [] printable){
        for (Printable p: printable ){
            if (p instanceof Book){
                p.print();

            }

        }

    }
}
