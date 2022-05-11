import java.util.Scanner;
import static java.lang.Integer.parseInt;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution08
 *  Copyright 2021 Sean Moore
 */

public class Solution08 {
    public static void main(String[] args){
        /*
         -Create an application that:
         -prompts user for number of people
         and pizza slices at a party
         -receives number of people
         attending a pizza party, the number of
         pizzas, and the number of slices
         per pizza as input
         -outputs back input
         -outputs number of slices per person
         -outputs remainder of pizza slices
         *THIS PROGRAM HAS NO CONSTRAINTS
         */
        
        //  Use scanner to take in number of people, number of pizzas, and number of slices per pizza
        Scanner input = new Scanner(System.in);
        int people,pies,slicesPer,slicesTot;
        System.out.printf("How many people? ");
        people = parseInt(input.nextLine());
        System.out.printf("How many pizzas do you have? ");
        pies = parseInt(input.nextLine());
        System.out.printf("How many slices per pizza? ");
        slicesPer = parseInt(input.nextLine());
        
        //  Calculate total number of slices
        slicesTot = slicesPer * pies;
        
        //  Output the number of people and number of pizzas, then the number of total slices,
        //  then calculate how many slices each person gets using integer division, and the remaining number of slices
        System.out.println(people + " people with " + pies + " pizzas ("+ slicesTot + " slices)");
        System.out.println("Each person gets " + (slicesTot/people) + " pieces of pizza.");
        System.out.println("There are "+ (slicesTot%people) + " leftover pieces.");
    }
}
