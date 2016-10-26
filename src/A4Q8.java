
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner for user
        Scanner in = new Scanner(System.in);

        //while loop to continuously play the game
        int number = 1;
        while (number < 100) {


            //user enter sum of dice
            System.out.println("Enter sum of dice: ");
            int number1 = in.nextInt();
            //add the dice rolled to the square user is on
            number = number + number1;
            //tell user what square they are on
            System.out.println("You are now on square " + number);


            //snake1
            if (number == 54) {
                number = number - 35;
            }

            //snake2
            if (number == 90) {
                number = number - 48;
            }

            //snake3
            if (number == 99) {
                number = number - 77;
            }

            //ladder1
            if (number == 9) {
                number = number + 25;
            }

            //ladder2
            if (number == 40) {
                number = number + 24;
            }

            //ladder3
            if (number == 67) {
                number = number + 19;
            }

            //endgame
            if (number == 100) {
                System.out.println("You win!");
            }

        }
    }
}
