
import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bulka4927
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Ask how much each thing costs
        System.out.println("How much does the food for prom cost? ");
        double number1 = in.nextDouble();

        System.out.println("How much does the DJ cost? ");
        double number2 = in.nextDouble();

        System.out.println("How much does it cost ot rent the hall? ");
        double number3 = in.nextDouble();

        System.out.println("How much does decorations cost? ");
        double number4 = in.nextDouble();

        System.out.println("How much does it cost for staff? ");
        double number5 = in.nextDouble();

        System.out.println("How much for miscellaneous costs? ");
        double number6 = in.nextDouble();

        //Total it all up
        double amount = number1 + number2 + number3 + number4 + number5 + number6;
        System.out.println("The total cost is $" + amount);


        double tickets = Math.ceil(amount / 35);
        System.out.println(" You will need to sell " + tickets + " tickets to break even.");

    }
}
