package main.java.academy.hw4;

import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Task1 {


    private static final Pattern dateDashPattern = Pattern.compile("[0-3]{1}\\d{1}-[01-12]{2}-\\d{4}");
    private static final String DATE_PATTERN = "dd-MM-yyyy";
    private Year year;
    private Month month;
    private DayOfWeek dayOfWeek;


    private class Year {

        private int year;


        public Year() {
        }


        public Year(int year) {
            this.year = year;
        }


        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }


    private class Month {

        private int month;

        public Month() {
        }

        public Month(int month) {
            this.month = month;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }
    }

    public enum DayOfWeek {
        MONDAY(1, "monday"),
        TUESDAY(2, "tuesday"),
        WEDNESDAY(3, "wednesday"),
        THURSDAY(4, "thursday"),
        FRIDAY(5, "friday"),
        SATURDAY(6, "saturday"),
        SUNDAY(7, "sunday");

        DayOfWeek(int dayNumber, String dayName) {
            this.dayNumber = dayNumber;
            this.dayName = dayName;
        }

        private int dayNumber;
        private String dayName;

        public int getDayNumber() {
            return dayNumber;
        }

        public void setDayNumber(int dayNumber) {
            this.dayNumber = dayNumber;
        }

        public String getDayName() {
            return dayName;
        }

        public void setDayName(String dayName) {
            this.dayName = dayName;
        }
    }

    public Task1() {
    }

    public Task1(String date) {
        if (validateDate(date)) {
            this.year = new Year(LocalDate.parse(date, DateTimeFormatter.ofPattern(DATE_PATTERN)).getYear());
            this.month = new Month(LocalDate.parse(date, DateTimeFormatter.ofPattern(DATE_PATTERN)).getMonth().getValue());
            this.dayOfWeek = getDayOfWeek(LocalDate.parse(date, DateTimeFormatter.ofPattern(DATE_PATTERN)));
        } else {
            this.year = new Year();
            this.month = new Month();
            this.dayOfWeek = null;
        }
    }

    private boolean validateDate(String date) {
        return dateDashPattern.matcher(date).matches();
    }

    private DayOfWeek getDayName(int dayNumber) {
        DayOfWeek[] daysOfWeek = DayOfWeek.values();
        for (DayOfWeek day : daysOfWeek) {
            if (day.dayNumber == dayNumber) return day;
        }
        return null;
    }

    public DayOfWeek getDayOfWeek(LocalDate date) {
        return getDayName(date.getDayOfWeek().getValue()) != null ? getDayName(date.getDayOfWeek().getValue()) : null;
    }

    public int countDays(LocalDate dateFrom, LocalDate dateTo) {
        return dateTo.getDayOfYear() - dateFrom.getDayOfYear();
    }

    public boolean isLeapYear() {
        if (year.getYear() % 4 == 0) return Boolean.TRUE;
        return Boolean.FALSE;
    }


}
