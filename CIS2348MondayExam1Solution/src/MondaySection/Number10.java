package MondaySection;

import java.util.Scanner;

/**
 * This question asks students to complete the java code.
 * Below is the complete java code for determining the percentage of a grade
 * that has an overall score of 20.
 * */

public class Number10 {
    public static void main(String[] args) {
        float marks, grades;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks out of 20: ");
        marks = input.nextFloat();
        grades = percent(marks);
        System.out.println("Your marks in percent is: " + grades + "%");

        /* this is another answer to one of the questions
        * check whether the returned percentage is passing or not
        * if it's greater than or equal to 50 - output should print pass
        * less than 50 - output should print fail*/
        if(grades >= 50)
            System.out.println("You pass!");
        else if (grades <50 )
            System.out.println("You failed.");
    }

    /* this is the answer to one of the questions
    * use the percent method to return the calculated percentage
    * of the grade entered by the user */
    public static float percent(float marks) {
        return (marks/20) * 100;
    }
}
