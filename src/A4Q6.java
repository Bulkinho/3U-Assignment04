
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //scanner for user
        Scanner in = new Scanner(System.in);
        //scenario 1
        //ask user for  minutes used 
        System.out.println("Number of day time minutes? ");
        double number1 = in.nextDouble();

        System.out.println("How many evening minutes? ");
        double number2 = in.nextDouble();

        System.out.println("Number of weekend minutes? ");
        double number3 = in.nextDouble();

        //plan A costs
        //daytime
        double cost1 = (number1 - 100) * 0.25;

        //evening
        double cost2 = number2 * 0.15;

        //weekend
        double cost3 = number3 * 0.20;

        //total of plan A
        double totalA = cost1 + cost2 + cost3;
        System.out.println("Plan A costs " + totalA);

        //plan B costs
        //daytime
        double cost4 = (number1 - 250) * 0.45;

        //evening
        double cost5 = number2 * 0.35;

        //weekend 
        double cost6 = number3 * 0.25;

        //total of plan B
        double totalB = cost4 + cost5 + cost6;
        System.out.println("Plan B costs " + totalB);

        //determine which is cheaper and display it to user
        if (totalB < totalA) {
            System.out.println("Plan B is the cheapest ");
        } else if (totalB > totalA) {
        }

        //scenario 2
        //ask user for  minutes used 
        System.out.println("Number of day time minutes? ");
        double number4 = in.nextDouble();

        System.out.println("How many evening minutes? ");
        double number5 = in.nextDouble();

        System.out.println("Number of weekend minutes? ");
        double number6 = in.nextDouble();

        //plan A costs
        //daytime
        double cost7 = (number4 - 100) * 0.25;

        //evening
        double cost8 = number5 * 0.15;

        //weekend
        double cost9 = number6 * 0.20;

        //total of plan A
        double totalA2 = cost7 + cost8 + cost9;
        System.out.println("Plan A costs " + totalA2);

        //plan B costs
        //daytime
        double cost10 = (number4 - 250) * 0.45;
        if (cost10 < 0) {
            cost10 = 0;
        }

        //evening
        double cost11 = number5 * 0.35;

        //weekend 
        double cost12 = number6 * 0.25;

        //total of plan B
        double totalB2 = cost10 + cost11 + cost12;
        totalB2 = Math.round(totalB2*100)/100.0;

        System.out.println("Plan B costs " + totalB2);

        //determine which is cheaper and display it to user
        if (totalB2 == totalA2) {
            System.out.println("Plan A and B are the same price ");
        } else if (totalB2 > totalA2) {
        }

        











    }
}
