import java.util.Scanner;
import static java.lang.Integer.parseInt;

/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution09
 *   Copyright 2021 Sean Moore
 */

public class Solution09 {
    public static void main(String[] args){
        /*
         -Create an application that prompts for input
         and receives dimensions of a ceiling to paint
         -Calculate the number of gallons of paint
         required to paint the surface area
         Rounds up to the next whole number of gallons needed
         using Math.ceil
         */
        Scanner input = new Scanner(System.in);
        int length,width,convert = 350;
        double area,gal;
        System.out.printf("Please enter the length of surface to paint: ");
        length = parseInt(input.nextLine());
        System.out.printf("Please enter the width of surface to paint: ");
        width = parseInt(input.nextLine());
        area = width * length;
        gal = area / convert;
        gal = Math.ceil(gal);
        System.out.println("You will need to purchase " + String.format("%.0f",gal) +" gallons of paint to cover "+ String.format("%.0f",area) +" square feet.");
    }
}
