import java.util.Scanner;

import static java.lang.Double.parseDouble;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution20
 *  Copyright 2021 Sean Moore
 */

public class Solution20 {
    public static void main(String[] args){
        /*
        -Create an application that prompts for and takes
        the cost of an order, as well as the state and
        county in which the user lives
        -if the State is Wisconsin,
            there will be a sales tax of 5%, additionally,
            if the County is Eau Claire,
                add an additional 0.5% tax
            otherwise if the County is Dunn,
                add an additional 0.4% tax
        -if the State is Illinois,
            add a statewide 8% tax
        -otherwise
            all other states do not charge tax
        -Application must round all money up to the nearest cent
         */
        Scanner input = new Scanner(System.in);
        String state,county;
        double subtotal, total, tax=0;

        System.out.printf("What is the order amount? ");
        subtotal = parseDouble(input.nextLine());
        System.out.printf("What state do you live in? ");
        state = input.nextLine();
        System.out.printf("What county do you live in? ");
        county = input.nextLine();

        total = subtotal;
        String output;
        output = "";
        if (state.equals("Wisconsin")){
            tax = 0.05;
            if (county.equals("Eau Claire"))
                tax += 0.005;
            else if (county.equals("Dunn"))
                tax += 0.004;
            tax *= subtotal;
            output = output.concat("The tax is $" + String.format("%.2f.\n",tax));
        }
        else if (state.equals("IL")){
            tax = 0.08;
        }
        total = subtotal + tax;
        output = output.concat("The total is $" + String.format("%.2f.",Math.ceil(total*100)/100));
        System.out.println(output);
    }
}
