import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution15
 *  Copyright 2021 Sean Moore
 */

public class Solution15 {
    public static void main(String[] args){
        /*
         -Make an application that prompts for and
          takes a username and password as input
         -if username and password are recognized
                output "Welcome!"
         -otherwise
                output "I don't know you."
         */
        Scanner input = new Scanner(System.in);
        String myName = "Jeanne", myPass = "abc$123";
        String userN,passW;
        System.out.printf("What is your username? ");
        userN = input.nextLine();
        System.out.printf("What is the password? ");
        passW = input.nextLine();
        if (userN.equals(myName) && passW.equals(myPass))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");
    }
}