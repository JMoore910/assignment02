import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import static java.lang.Double.parseDouble;

/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution11
 *   Copyright 2021 Sean Moore
 */

public class Solution11 {
    public static void main(String[] args){
        /*
        -Create an application that prompts for and takes an amount
        in Euros and an exchange rate as input
        -The application then outputs what the amount would be in
        US DOLLARS
        -Output MUST round up to the nearest cent using setScale(2 digits right of decimal,RoundingMode Ceiling)
        -Use a single output statement
        -Use BigDecimal rounding from Chapter 8 to get proper output
         */
        Scanner input = new Scanner(System.in);
        double euro,rate,usd;
        System.out.printf("How many euros are you exchanging? ");
        euro = parseDouble(input.nextLine());
        System.out.printf("What is the exchange rate? ");
        rate = parseDouble(input.nextLine());
        usd = euro * rate;
        BigDecimal ex = new BigDecimal(usd);
        ex = ex.setScale(2,RoundingMode.CEILING);
        System.out.println(String.format("%.2f",euro)+" euros at an exchange rate of "+rate+" is \n"+ex+" U.S. dollars.");
    }
}
