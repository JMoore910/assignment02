import java.util.Scanner;
import static java.lang.Double.parseDouble;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution19
 *  Copyright 2021 Sean Moore
 */

public class Solution19 {
    public static void main(String[] args){
        /*
        -Create an application that prompts user for Weight and Height
        and uses them to calculate user's BMI through a given formula
        -The formula used for computing bmi is as follows:
            bmi = (weight / (height * height)) * 703
         */
        Scanner input = new Scanner(System.in);
        double weight, height, bmi;
        System.out.printf("Enter weight: ");
        if (input.hasNextDouble())
            weight  = parseDouble(input.nextLine());
        else
            throw new IllegalArgumentException("Not a number");

        System.out.printf("Enter height: ");
        if (input.hasNextDouble())
            height  = parseDouble(input.nextLine());
        else
            throw new IllegalArgumentException("Not a number");

        bmi = (weight / (height * height)) * 703;
        String output;
        if (bmi < 18.5)
            output = "\nYou are underweight.";
        else if (bmi > 25)
            output = "\nYou are overweight.";
        else
            output = "\nYou are within the ideal weight range";
        System.out.println("Your BMI is "+String.format("%.1f.",bmi)+output);
    }
}
