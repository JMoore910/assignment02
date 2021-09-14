import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution23
 *  Copyright 2021 Sean Moore
 */

public class Solution23 {
    public static void main(String[] args){
        /*
        -Create an application that troubleshoots a car not starting
        ************************************************************
        -if silent keyturn (y/n)
            -if battery terminals corroded (y/n)
                "clean terminals and try again
            -else
                "replace cables and try again
        -else
            -if clicking noise (y/n)
                "replace battery"
            -else
                -if the car cranks but fails to start (y/n)
                    "check spark plug and ignition coil connections"
                -else
                    -if the engine starts then dies (y/n)
                        -if car has fuel injection (y/n)
                            "Take it in for service"
                        -else
                            "Check if the choke is opening and closing"
                    -else
                        "Your problem is not related to starting the car"
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Troubled start troubleshooter:");
        System.out.printf("\nIs the engine silent upon keyturn? (y/n): ");
        if (input.nextLine().equals("y")) {
            System.out.printf("Are the battery terminals corroded? (y/n): ");
            if (input.nextLine().equals("y"))
                System.out.println("Clean the terminals and try again.");
            else
                System.out.println("Replace the cables and try again.");
        } else {
            System.out.printf("Does turning the key make a clicking noise? (y/n): ");
            if (input.nextLine().equals("y"))
                System.out.println("Replace the battery.");
            else {
                System.out.printf("Does the engine crank but not start? (y/n): ");
                if (input.nextLine().equals("y"))
                    System.out.println("Check spark plug and ignition coil connections.");
                else {
                    System.out.printf("Does the engine start and then die? (y/n): ");
                    if (input.nextLine().equals("y")) {
                        System.out.printf("Is your engine fuel injected? (y/n): ");
                        if (input.nextLine().equals("y"))
                            System.out.println("Get your engine serviced.");
                        else
                            System.out.println("Check that the choke is opening and closing.");
                    } else
                        System.out.println("Your engine does not have a starting problem.");
                }
            }
        }
    }
}
