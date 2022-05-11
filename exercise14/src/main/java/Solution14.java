import java.math.BigDecimal;
import java.math.RoundingMode;
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
        -use some other method to round instead of BigDecimal
         */
        
        //  Use scanner to take the amount and state, if the state has a special tax rate (Wisconsin) calculate using a special 
        Scanner input = new Scanner(System.in);
        String state;
        double subtotal,total,tax=.055;
        
        //  Take in amount and state 
        System.out.printf("What is the amount? ");
        subtotal = parseDouble(input.nextLine());
        System.out.printf("What is the state? ");
        state = input.nextLine();
        total = subtotal;
        String output;
        output = "";
        
        //  Check if the state applies a special tax situation
        if (state.contains("WI")==true){
            //  Calculate the tax and total given wisconsin
            tax *= subtotal;
            total = subtotal + tax;

            //  Output the tax
            //finTax = finTax.setScale(2,RoundingMode.CEILING);
            output = ("The subtotal is $" + String.format("%.2f",subtotal));
            output = output.concat(".\nThe tax is $" + String.format("%.2f.\n",tax));
        }
        
        //  Output the total amount calculated
        output = output.concat("The total is $" + String.format("%.2f.",Math.ceil(total*100)/100));
        System.out.println(output);
    }
}
