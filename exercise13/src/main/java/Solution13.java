import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import static java.lang.Double.parseDouble;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution13
 *  Copyright 2021 Sean Moore
 */

public class Solution13 {
    public static void main(String[] args){
        /*
        -Create an application that will:
        -Prompt for principal, rate, time, comp as input
        -Calculate final amount with compounded interest
        -Use BigDecimal to round up to the next cent
        -Outputs final amount after the time input passed
         */
        
        //  Use a scanner to take the principal, interest rate, num years, and interest compound rate
        Scanner input = new Scanner(System.in);
        double principal, rate, time, comp, amount, fin;
        System.out.printf("What is the principal amount? ");
        principal = parseDouble(input.nextLine());
        System.out.printf("What is the rate? ");
        rate = parseDouble(input.nextLine());
        System.out.printf("What is the number of years? ");
        time = parseDouble(input.nextLine());
        System.out.printf("What is the number of times the interest is compounded per year? ");
        comp = parseDouble(input.nextLine());

        //  Calculate total amount
        amount = (1 +  rate / (100*comp));
        fin = amount;
        for (int i=1;i<(comp*time);i++)
        {
            fin = fin * amount;
        }
        fin = fin * principal;
        BigDecimal finalAmount = new BigDecimal(fin);
        
        //  Use big decimal rounding to round final amount up to nearest cent, then output the final amount as well as all input values
        finalAmount = finalAmount.setScale(2, RoundingMode.CEILING);
        System.out.printf("$%.2f invested at ",principal);
        System.out.printf(String.format("%.1f",rate)+"%% for "+String.format("%.0f",time)+" years compounded ");
        System.out.printf(String.format("%.0f",comp)+" times per year is $"+finalAmount+".");
    }
}
