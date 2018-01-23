package hackerrank.introduction.java_currency_formatter;

import java.util.*;
import java.text.*;

public class Solution {

    /*
    * Given a double-precision number, payment, denoting an amount of money, use the NumberFormat
    * class' getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French
    * currency formats. Then print the formatted values as follows:
    *
    * Sample Input

    12324.134

    Sample Output

    US: $12,324.13
    India: Rs.12,324.13
    China: ￥12,324.13
    France: 12 324,13 €

    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = getLocalizedPayment(payment, Locale.US);
        String india = getLocalizedPayment(payment, new Locale("en", "in"));
        String china = getLocalizedPayment(payment, Locale.CHINA);
        String france = getLocalizedPayment(payment, Locale.FRANCE);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    private static String getLocalizedPayment(double payment, Locale locale) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(payment);
    }
}