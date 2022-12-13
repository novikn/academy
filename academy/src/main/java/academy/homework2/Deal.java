package main.java.academy.homework2;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {


        String[] suit = {"\u2666", "\u2660", "\u2663", "\u2665"};
        String[][] cart = {{"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"},
                {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"},
                {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"},
                {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество игроков от 2 до 10: ");
        int players = sc.nextInt();
        if (players < 2 || players > 10) {
            System.out.println("Игра не состоится, количество игроков должно быть не менее 2 и не более 10 ");
        } else {

        for (int i = 1; i <= players; i++) {
            System.out.print("У" + i + "-го игрока выпала следующая комбинация:");
            int j = 0;
            Random m = new Random();
            Random k = new Random();

            while (j < 5) {
                int mast = m.nextInt(4);
                int karta = k.nextInt(13);
                if (!Objects.equals(cart[mast][karta], "")) {
                    System.out.print(suit[mast] + cart[mast][karta] + " ");
                    // удаляем карту из массива
                    cart[mast][karta] = "";
                    j++;
                }
            }
            }

            System.out.println();
        }
    }
}