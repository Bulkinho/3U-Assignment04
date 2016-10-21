
import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bulka4927
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner for user
        Scanner in = new Scanner(System.in);

        //sceanrio if driver is not speeding
        //get speed limit
        System.out.println("Enter the speed limit: ");
        double number1 = in.nextDouble();

        //get speed of driver
        System.out.println("Enter the recorded speed of the driver: ");
        double number2 = in.nextDouble();

        //determine if over the limit
        if (number1 > number2) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else if (number1 < number2) {
        }

        //scenario if driver is speeding
        //get speed limit
        System.out.println("Enter the speed limit: ");
        double number3 = in.nextDouble();

        //get speed of driver
        System.out.println("Enter the recorded speed  of the driver: ");
        double number4 = in.nextDouble();

        //fines for speeding
        if (number3 < number4 && number3 + 20 < number4) {
            System.out.println("You are speeding and your fine is $100.");
        }
        if (number3 < number4 && number3 + 30 < number4) {
            System.out.println("You are speedning and your fine is $270.");
        }
        if (number3 < number4 && number3 + 31 < number4) {
            System.out.println("You are speeding and your fine is $500.");
        }
    }
}
