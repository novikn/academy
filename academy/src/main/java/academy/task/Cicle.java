package main.java.academy.task;

import java.util.Scanner;

public class Cicle {
    public static void main(String[] args) {
       ////Передать на вход программы число в качестве аргумента.Если оно нечетное, распечатать его. Используем оператор if.
        //        Используйте метод Integer.parseInt() для преобразования из String в int

        int n = Integer.parseInt(args [0]);//из строки  число

        if (n % 2 != 0){
            System.out.println(n);
        }
///Передать на вход программы число От 1 до 7 в качестве аргумента. Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и
//так далее. Если 6 или 7 – “Выходной”. Используем конструкцию if-else-if
        if (n==1){
            System.out.println("Понедельник");
        } else if (n==2){
            System.out.println("вторник");
             }else if (n==3) {
                System.out.println("cреда");
                 }else if (n==4){
                   System.out.println("четверг");
                      }else if (n==5) {
                        System.out.println("пятница");
                           }else if (n==6&n==7) {
                             System.out.println("выходной");
        }

//С помощью класса Scanner ввести целое число. //Если это число от 0 до 10, вывести на консоль сообщение
//“Положительное число меньше 10”, иначе вывести сообщение //“Положительное число больше 10 или отрицательное”.
//Используем оператор if-else.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number= sc.nextInt();
        if (number<=10) {
            System.out.println("оложительное число меньше 10");
        } else System.out.println("Положительное число больше 10 или отрицательное");
        }




    }



