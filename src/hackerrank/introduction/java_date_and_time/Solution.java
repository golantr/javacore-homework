package hackerrank.introduction.java_date_and_time;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Locale;

public class Solution {

    /*
    * You are given a date. You just need to write the method, getDay, which returns the day on that date.
    * */

    public static String getDay(String day, String month, String year) {

        int yearInt = Integer.parseInt(year);
        int monthInt = Integer.parseInt(month) - 1;
        int dayInt = Integer.parseInt(day);

        Calendar cal = Calendar.getInstance(Locale.US);
        cal.set(yearInt, monthInt, dayInt);
        String dayOfTheWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
        return String.valueOf(dayOfTheWeek.toUpperCase());
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}