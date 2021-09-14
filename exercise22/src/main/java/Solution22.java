import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution22
 *  Copyright 2021 Sean Moore
 */

public class Solution22 {
    public static void main(String[] args){
        /*
        -Create an Application that prompts for three numbers
        as user input.
        -The application checks
        if all numbers are unique
            the application finds and
            outputs the largest of them
        else,
            the application closes
         */
        Scanner input = new Scanner(System.in);
        int[] arr = {0,0,0};
        int counter = 0;
        int stopFlag = 0;

        System.out.printf("Enter the first number: ");
        arr[counter++] = input.nextInt();
        System.out.printf("Enter the second number: ");
        arr[counter++] = input.nextInt();
        System.out.printf("Enter the third number: ");
        arr[counter++] = input.nextInt();

        if ((arr[0] == arr[1]) || (arr[0] == arr[2]) || (arr[1] == arr[2])) {
            stopFlag = 1;
        }

        if (stopFlag == 0) {
            if (arr[0] > arr[1]){
                if (arr[0] > arr[2])
                    System.out.println("The largest number is "+arr[0]+".");
                else
                    System.out.println("The largest number is "+arr[2]+".");
            }
            else {
                if (arr[1] > arr[2])
                    System.out.println("The largest number is " + arr[1] + ".");
                else
                    System.out.println("The largest number is " + arr[2] + ".");
            }
        }
    }
}
