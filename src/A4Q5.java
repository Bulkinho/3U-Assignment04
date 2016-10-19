
import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bulka4927
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ask the user for their name
        System.out.println("Please enter your name");
        // get the name for the user 
        String name = in.nextLine();

        //Ask what the tests were out of and what mark recieved
        System.out.println("What was the first test out of? ");
        double number1 = in.nextDouble();
        System.out.println("What mark did you get? ");
        double number2 = in.nextDouble();

        System.out.println("What was the second test out of? ");
        double number3 = in.nextDouble();
        System.out.println("What mark did you get? ");
        double number4 = in.nextDouble();

        System.out.println("What was the third test out of? ");
        double number5 = in.nextDouble();
        System.out.println("What mark did you get? ");
        double number6 = in.nextDouble();

        System.out.println("What was the fourth test out of? ");
        double number7 = in.nextDouble();
        System.out.println("What mark did you get? ");
        double number8 = in.nextDouble();

        System.out.println("What was the fifth test out of? ");
        double number9 = in.nextDouble();
        System.out.println("What mark did you get? ");
        double number10 = in.nextDouble();

        //show user test scores
        System.out.println("Test scores for user");

        double percent1 = number2 / number1;
        System.out.println("Test 1:" + percent1);

        double percent2 = number4 / number3;
        System.out.println("Test 2:" + percent2);

        double percent3 = number6 / number5;
        System.out.println("Test 3:" + percent3);

        double percent4 = number8 / number7;
        System.out.println("Test 4:" + percent4);

        double percent5 = number10 / number9;
        System.out.println("Test 5:" + percent5);

        //calculate average for user
        double total = percent1 + percent2 + percent3 + percent4 + percent5;
        double average = total / 5;

        System.out.println("Average: " + average + " %");







    }
}
