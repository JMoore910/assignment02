import java.math.BigDecimal;
import java.util.Scanner;
import static java.lang.Double.parseDouble;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution14
 *  Copyright 2021 Sean Moore
 */

public class Solution14 {
    public static void main(String[] args){
        /*
        -Create an application that prompts for, and
        takes an order cost, and a state as input
        -if the state is WI,
            -a tax of 5.5% should be applied to the order
            -The Application outputs a subtotal, and a tax
        -the order total is then printed
         */
        Scanner input = new Scanner(System.in);
        String state;
        double subtotal,total,tax=.055;
        System.out.printf("What is the amount? ");
        subtotal = parseDouble(input.nextLine());
        System.out.printf("What is the state? ");
        state = input.nextLine();
        total = subtotal;
        if (state == "WI"){
            tax = subtotal * tax;

            BigDecimal fin = new BigDecimal("12");
            System.out.println("The subtotal is $"+String.format("%.2f",subtotal)+"\nThe tax is ");
        }
    }
}