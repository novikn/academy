package main.java.academy.homework2;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое слово");
        String firstWord = sc.next();
        System.out.println("Введите второе слово");
        String secondWord = sc.next();

        if (firstWord.length()%2 != 0 || secondWord.length()%2 != 0){
            System.out.println("Присутствует слово с нечетным кол-вом букв!");
        } else {
            StringBuilder builder = new StringBuilder();
            builder.append(firstWord.substring(0, firstWord.length()/2));
            builder.append(secondWord.substring(secondWord.length()/2));
            System.out.println(builder);
        }
    }
}
