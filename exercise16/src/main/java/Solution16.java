import java.util.Scanner;
import static java.lang.Integer.parseInt;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution16
 *  Copyright 2021 Sean Moore
 */

public class Solution16 {
    public static void main(String[] args){
        /*
           -Create an application that prompts for and takes
           user's age as input.
           -The application then checks if the user is of driving age
           using a ternary operator
           -Using the info from the ternary operator create a string to
           output and tell the user whether they can legally drive or not
           -String x = i1>i2 ? "this is x if true" : "this is x if false";
         */
        
        //  Use scanner to get user age as input
        Scanner input = new Scanner(System.in);
        int userAge,driveAge=16;
        System.out.printf("What is your age? ");
        userAge = parseInt(input.nextLine());
        //  Use drive age to determine whether to say whether the user is old enough to drive or not
        String output = userAge>=driveAge ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(output);
    }
}
