import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution21
 *  Copyright 2021 Sean Moore
 */

public class Solution21 {
    public static void main(String[] args){
    /*
        -Create an Application that prompts for and receives a number from 1-12
        -Then the input number is sent through a switch operation to receive a
        string to output (month)
        -Application must output to a single line
     */
        Scanner input = new Scanner(System.in);
        int monthCase;
        String month = "";

        System.out.printf("Please enter the number of the month: ");
        monthCase = input.nextInt();

        switch(monthCase){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid Input";
                break;
        }

        System.out.println("The name of the month is " + month);

    }
}
