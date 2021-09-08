import java.util.Scanner;
import static java.lang.Integer.parseInt;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution06
 *  Copyright 2021 Sean Moore
 */

public class Solution07 {
    public static void main(String[] args){
        /*
          -Create an application that receives two input distances in feet
          as dimensions for a 2D surface
          -Prompts user for length : receives input length
          -Prompts user for width : receives input width
          -converts both input vars to integers
          -outputs square feet area created by input
          -outputs a converted square meter area of the same input
          -KEEP calculations separate from output
          -Use a constant to hold the conversion factor
         */
        Scanner input = new Scanner(System.in);
        double areaM,convert = 0.09290304;
        int length,width,areaF;
        System.out.printf("What is the length of the room in feet? ");
        length = parseInt(input.nextLine());
        System.out.printf("What is the width of the room in feet? ");
        width = parseInt(input.nextLine());
        System.out.println("You entered the dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is");
        areaF = length * width;
        areaM = areaF * convert;

        System.out.println(areaF + " square feet");
        System.out.println(String.format("%.3f",areaM) + " square meters");
    }
}
