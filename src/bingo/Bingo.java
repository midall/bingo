/* TRUNK */
package bingo;

import java.util.Scanner;
import bingo.*;

public class Bingo {

    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Please Select: ");
            System.out.println("1. New player ");
            System.out.println("0. Exit ");


            choice = input.nextInt();

            if(choice == 1) {
                

            } else if(choice == 0) {
                System.out.println("Bye bye!");
                
            } else {
                System.out.println("Please try again");
                
            }
            
            //end while
        }while(choice != 0);
    
        //end main
    }
 
    //end class
}
