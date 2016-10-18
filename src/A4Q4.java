
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
       
        //Ask howm much each thing costs
        System.out.println("How much does the food for prom cost? ");
        
        System.out.println("How much does the DJ cost? ");
        
        System.out.println("How much does it cost ot rent the hall? ");
        
        System.out.println("how much does decorations cost? ");
        
        System.out.println("How much does it cost for staff? ");
        
        System.out.println("How much for miscellaneous costs? ");
        
        System.out.println("The total cost is $");
        
        
        //Total it all up
        double amount = in.nextDouble();

        double tickets = amount/35;
        
    }
}
