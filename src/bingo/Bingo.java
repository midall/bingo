/* TRUNK */
package bingo;

import bingo.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Bingo {

    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Please Select: ");
            System.out.println("1. New Game ");
            System.out.println("0. Exit ");


            choice = input.nextInt();

            if(choice == 1) {
                int numOfPlayers, numOfCards;
                
                System.out.println("How many players are in this game? ");
                numOfPlayers = input.nextInt();
                ArrayList<Player> players = new ArrayList<Player>(numOfPlayers);


                for(int i = 0; i < numOfPlayers; i++)
                {
                    Player plr = new Player();
                    System.out.print("What is Player " + (i + 1) + " name? ");
                    String name = input.next();
                    plr.setName(name);
                    
                    /* FOR MORE THAN ONE CARDS */
                    System.out.print("How many Bingo cards for " + plr.getName() + ": ");
                    numOfCards = input.nextInt();
                    
                    for(int j = 1; j < numOfCards; j++) {
                        plr.newCard();
                    }
                    
                    
                    players.add(plr);
                }
                
                //PLAYERS DATA
                for(Player plr: players){
                  System.out.println("ID: " + plr.getPid() + " NAME: " + plr.getName() + " No.CARDS: " + plr.countCards());
                }
                
                //GAME START
                System.out.println("GAME STARTED! ");
                BingoGame bg = new BingoGame();
                boolean bingo = false;
                
                while(bingo == false) {
                    int no = bg.getNextNumber();
                    System.out.println("NEXT NUMBER: " + no);
                    for(Player plr: players){
                        plr.newNumber(no);
                        plr.leftNumbers();
                        if(plr.isBingo()) {
                            System.out.println("PLAYER " + plr.getName() + " WON!");
                            bingo = true;
                        }
                    }
                }
                
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
