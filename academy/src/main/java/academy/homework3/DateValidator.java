package main.java.academy.homework3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class DateValidator {
    private static final Pattern dateDashPattern = Pattern.compile("[0-3]{1}\\d{1}-[01-12]{2}-\\d{4}");
    private static final Pattern dateSlashPattern = Pattern.compile("[0-3]{1}\\d{1}/[01-12]{2}/\\d{4}");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        if (matchesDashDate(date)) printDate(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        else if (matchesSlashDate(date)) printDate(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy")));


    }

    public static void printDate(LocalDate date) {
        System.out.printf("Day: %s%nMonth: %s%nYear: %s%n", date.getDayOfWeek(), date.getMonth(), date.getYear());
    }

    public static LocalDate getLocalDate(String date) {
        if (matchesDashDate(date).equals(Boolean.TRUE))
            return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        else if (matchesSlashDate(date).equals(Boolean.TRUE))
            return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return null;
    }

    public static Boolean matchesDashDate(String date) {
        return dateDashPattern.matcher(date).matches();
    }

    public static Boolean matchesSlashDate(String date) {
        return dateSlashPattern.matcher(date).matches();
    }


}
