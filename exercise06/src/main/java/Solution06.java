import java.util.Scanner;
import static java.lang.Integer.parseInt;
import java.util.Calendar;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution06
 *  Copyright 2021 Sean Moore
 */

public class Solution06 {
    public static void main(String[] args){

        /*
            Create an application that takes input from user
            -Prompts user to input current age
             then receives curAge from input
            -Prompts user to input retire age
             then receives retAge from input
            -both are converted with parseInt()
            -Application prints the year difference until User retires
            -Application fetches current date using local
            -current year and year of retirement are then output
         */
        
        //  Create a calendar and use built in type to store current date
        Calendar now = Calendar.getInstance();
        Scanner input = new Scanner(System.in);
        int curAge,retAge,curYear,ageDif;
        curYear = now.get(Calendar.YEAR);
        
        //  Take user's age and desired age to retire at
        System.out.printf("What is your current age? ");
        curAge = parseInt(input.nextLine());
        System.out.printf("At what age would you like to retire? ");
        retAge = parseInt(input.nextLine());
        ageDif = retAge - curAge;
        
        //  Calculate and output the number of years the user has until retirement from the current year
        System.out.println("You have " + ageDif + " years left to retire.");
        System.out.println("It's " + curYear + ", so you can retire in " + (curYear+ageDif) + ".");
    }
}
