import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Math.abs;

import java.util.Calendar;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution06
 *  Copyright 2021 Sean Moore
 */

public class Challenge01 {
    public static void main(String[] args){

        /*
            **CHALLENGE**
            Create an application that takes input from user
            -Prompts user to input current age
             then receives curAge from input
            -Prompts user to input retire age
             then receives retAge from input
            -both are converted with parseInt()
            -Application prints the year difference until User retires
            -Application fetches current date using local
            -current year and year of retirement are then output
            * Challenge states, program must check if
            * User may already retire
         */
        Calendar now = Calendar.getInstance();
        Scanner input = new Scanner(System.in);
        int curAge,retAge,curYear,ageDif;
        curYear = now.get(Calendar.YEAR);
        System.out.printf("What is your current age? ");
        curAge = parseInt(input.nextLine());
        System.out.printf("At what age would you like to retire? ");
        retAge = parseInt(input.nextLine());
        ageDif = retAge - curAge;

        if (ageDif > 0) {
            System.out.println("You have " + ageDif + " years left to retire.");
            System.out.println("It's " + curYear + ", so you can retire in " + (curYear + ageDif) + ".");
        }

        else {
            System.out.println("You were able to retire " + abs(ageDif) + " years ago\nin " + (curYear + ageDif) + ".");
        }
    }
}
