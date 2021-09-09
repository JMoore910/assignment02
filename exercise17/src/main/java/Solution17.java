import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution17
 *  Copyright 2021 Sean Moore
 */

public class Solution17 {
    public static void main(String[] args){
        /*
           -Create an application that prompts for user's sex,
           alcohol consumed, weight, and hours since the last drink
           -The application then runs a Blood Alcohol Calculator
           to determine whether it is safe for the user to drive or not
           --BAC = (A * 5.14 / W * r) - (0.015 * H)
           where A is alcohol consumed (oz)
           W is body weight (lb)
           H is time since last drink (hr)
           r is the alcohol distribution ratio
                   r = 0.73 if Male
                   r = 0.66 if Female
           use input checks to see if input.hasNextDouble()
           if any input would be wrong, throw an error
         */
        Scanner input = new Scanner(System.in);
        double s, r, H, W, A, BAC;

        //User's sex
        System.out.printf("Enter a 1 if you are male or a 2 if you are female: ");
        if (input.hasNextDouble()){
            s = input.nextDouble();
            if (s != 1 && s != 2)
                throw new IllegalArgumentException("Non binary is not a sex");
            else
                r = (s == 1) ? 0.73 : 0.66;
        }
        else
            throw new IllegalArgumentException("Must enter a number");

        //User's Drinking problem
        System.out.printf("How many ounces of alcohol did you have? ");
        if (input.hasNextDouble())
            A = input.nextDouble();
        else
            throw new IllegalArgumentException("Must enter a number");

        //Weight of user
        System.out.printf("What is your weight, in pounds? ");
        if (input.hasNextDouble())
            W = input.nextDouble();
        else
            throw new IllegalArgumentException("Must enter a number");

        //Time since last drink
        System.out.printf("How many hours has it been since your last drink? ");
        if (input.hasNextDouble())
            H = input.nextDouble();
        else
            throw new IllegalArgumentException("Must enter a number");

        BAC = (A * 5.14 / W * r) - (0.015 * H);

        String output = BAC < 0.08 ? "\nIt is legal for you to drive." : "\nIt is not legal for you to drive.";
        System.out.println("Your BAC is "+ String.format("%.6f.",BAC) + output);
    }
}