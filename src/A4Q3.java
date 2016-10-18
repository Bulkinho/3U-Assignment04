
import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bulka4927
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new Scanner to read in values
        Scanner in = new Scanner(System.in);

        // create an integer to store a number
        int myInt;

        // Read in a single word from the user
        System.out.println("Please enter in 4 numbers on seperate lines");
       
         double number1 = in.nextDouble();
          double number2 = in.nextDouble();
           double number3  = in.nextDouble();
            double number4 = in.nextDouble();

        //sort numbers
        System.out.println("Your numbers were " + number1 + ", " + number2 + ", " + number3 + ", " + number4 );
        


     
    }
}
