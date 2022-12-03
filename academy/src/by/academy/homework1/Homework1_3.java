package by.academy.homework1;

import java.util.Scanner;

public class Homework1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10");
        int number = sc.nextInt();
        int n=1;
        while (n<=10){
            System.out.println(number + "*" + n + "=" + number*n);
            n++;
        }
    }
}
