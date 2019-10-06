package MondaySection;
/**
 * The question asks to write a java code that lets users enter 5 numbers and
 * determines the largest among the input.
 * */

import java.io.IOException;
import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) throws IOException {
        /* Initialize variables */
        int maxNum;
        int numInput;

        System.out.println("This program determines the largest number among the 5 input.\nIt only accepts 5 numbers.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers in this line followed by a space: ");
        numInput = input.nextInt();
        maxNum = numInput; //assume largest number is the input

        for(int i = 0; i < 4; i++){ //get remaining user input using a loop
            numInput = input.nextInt();
            if(maxNum < numInput) //compare if succeeding input is larger than the previous input
                maxNum = numInput; //if it is, then the succeeding input is the new largest number
        }

        System.out.println("Your largest number is: " + maxNum); //print the largest number

    }
}
