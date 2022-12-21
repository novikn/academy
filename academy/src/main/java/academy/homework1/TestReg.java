package main.java.academy.homework1;
 import  java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TestReg {
    static Pattern pattern = Pattern.compile("[!.;:,]");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Matcher matcher = pattern.matcher(sc.nextLine());

        int counter=0;
        while (matcher.find()) {
            System.out.println(matcher.group()); // выводит на экран найденные символы
            counter++;
        }
        System.out.println(counter);
        sc.close();
    }
}
