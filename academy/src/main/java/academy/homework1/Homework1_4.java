package main.java.academy.homework1;

public class Homework1_4 {
    public static void main(String[] args) {
        int n = 2;
        int result=2;
        do {
            result =result*2;
            System.out.println("2 в степени " + n + "=" + result);
            n++;
        } while (result < 1000000);
    }
}
