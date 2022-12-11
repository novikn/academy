package main.java.academy.homework1;

import java.util.Scanner;

public class StringTest {
    //    1. Ввести n строк с консоли, найти самую короткую и самую длинную строки.
    public static void main(String[] args) {
// максимальное значение задаем изначально минимальным
        int maxLength = 0;
        // минимальное наоборот
        int minLength = Integer.MAX_VALUE;

        System.out.println("Enter number n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // массив строк размером n
        String[] stringArray = new String[n];

        //цикл записи массива
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter %s string%n", i);
            stringArray[i] = sc.next();
            if (stringArray[i].length() > maxLength) maxLength = stringArray[i].length();
            if (stringArray[i].length() < minLength) minLength = stringArray[i].length();
        }

        System.out.printf("Minimal length is %s Maximal length is %s%n", minLength, maxLength);
    }
//    String string = "qqqwwweeerrrtyui";
//    String [] strings = {};
//    int [] array = new int [256];
//    int [] chars= string.chars().toArray();
//    for (int c : chars){
//        array[c]++;
//    }
//int notZiro = 0;
//    for (int c : array){
//        array[c]++;
//
//    }
}
