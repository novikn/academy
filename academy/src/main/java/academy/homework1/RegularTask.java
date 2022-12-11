package main.java.academy.homework1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularTask {
   
    //String p = "";
    static Pattern pattern = Pattern.compile("[!.,;:]");

    public static void main(String[] args) {


        Scanner sc1 = new Scanner(System.in);
        Matcher matcher = pattern.matcher(sc1.nextLine());
        int counter = 0;
        while (matcher.find()) {
            System.out.println(matcher.group());
            counter++;
        }
        System.out.println(counter);
        sc1.close();
    }

}


