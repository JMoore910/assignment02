import java.util.Scanner;
import static java.lang.Double.parseDouble;

    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution18
     *  Copyright 2021 Sean Moore
     */

public class Solution18 {
    public static void main(String[] args){
        /*
        -Create an application that allows user input temperature
        to be converted from Fahrenheit to Celsius, and vice versa
        -Application prompts user for a temperature
        -Application prompts user for C or F to be input
        -use if statements to determine which conversion to perform
         */
        Scanner input = new Scanner(System.in);
        String outStr = " if you would like to convert from ",F = " Fahrenheit",C = " Celsius";
        System.out.printf("Enter 'C'"+outStr+F+" to"+C+"\nEnter 'F'"+outStr+C+" to"+F+"\nYour Choice: ");
        String tempStr = input.nextLine();

        System.out.printf("Enter a temperature: ");
        double tempVal = parseDouble(input.nextLine());

        if (tempStr.equals("C") || tempStr.equals("c") || tempStr.equals("F") || tempStr.equals("f")){
            if (tempStr.equals("C") || tempStr.equals("c")) {
                tempVal = (tempVal - 32) * (5.0 / 9);
                tempStr = C;
            }
            else {
                tempVal = (tempVal * 9.0 / 5) + 32;
                tempStr = F;
            }
        }
        System.out.println("The temperature in" + tempStr + " is " + String.format("%.1f.",tempVal));
    }
}
