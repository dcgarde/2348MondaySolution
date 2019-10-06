package MondaySection;
/**
 * The question asks to write a Java program that can calculate the total sale
 * of Alice's purchase from the grocery and to print an itemized receipt--
 * */
public class Number4 {
    public static void main(String agrs[]){
        /* Initialize variables */
        int numApple = 3;
        int numOrange = 4;
        double costOfApple = 0.50;
        double costOfOrange = 0.75;
        double salesTax = 0.02; //sales tax is 2%

        /* Calculate total sale without tax */
        double totalNoTax = (costOfApple*numApple) + (costOfOrange*numOrange);

        /* Calculate total sale with tax */
        double totalWithTax = (totalNoTax * salesTax) + totalNoTax;

        /* Print out receipt to user */
        System.out.println("Sales Receipt: ");
        System.out.println("------------------------------------------");

        /* This prints out an itemized list of Alice's grocery */
        System.out.println("Apples x " + numApple + ": $" + (numApple * costOfApple));
        System.out.println("Oranges x " + numOrange + ": $" + (numOrange * costOfOrange));
        System.out.println("------------------------------------------");

        /* This prints out the subtotal of Alice's grocery and the sales tax*/
        System.out.println("Subtotal: $" + totalNoTax);
        System.out.println("Sales Tax: $" + (totalNoTax * salesTax));
        System.out.println("------------------------------------------");
        System.out.println("Total sale: $" + totalWithTax); //this prints the total sale of Alice's grocery
    }
}
