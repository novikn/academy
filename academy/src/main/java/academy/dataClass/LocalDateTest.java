package main.java.academy.dataClass;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTest {
    public static void main(String[] args) {


    LocalDate bday = LocalDate.of(1987,6,25);
    LocalDate today = LocalDate.now();
        DayOfWeek dayWeekEnum = bday.getDayOfWeek();
        System.out.println (dayWeekEnum);

        int dayYear = bday.getDayOfYear();
        System.out.println(dayYear);

        Month month = bday.getMonth();
        System.out.println(month);

        int year = bday.getYear();
        System.out.println(year);


        LocalTime timeNow= LocalTime.now();
        System.out.println(timeNow);



        if (bday.isAfter(today))
            System.out.println("Дата дня рождения позже сегодня");
        else
            System.out.println("Дата дня рождения раньше сегодня");

        if (bday.isBefore(today))
            System.out.println("Дата дня рождения раньше сегодня");
        else
            System.out.println("Дата дня рождения позже сегодня");
    }

}


