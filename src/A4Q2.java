
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);

        //ask amount to be converted
        System.out.println("Please enter the measurement in inches you wish to convert");


        double inches = input.nextDouble();

        double centimetres = 2.54 * inches;
        //tell user the converted amount
        System.out.println(inches + " is the same as " + centimetres);



        //ask amount to be converted
        System.out.println("Please enter the measurement in inches you wish to convert");













    }
}
