/* TRUNK */
package bingo;
//import java.util.ArrayList;

public class BingoCard {
    
    private int noStamp;
    private int[] cardNumbers = new int[24];
    
    public BingoCard(){
        generateNumbers();
    }
    
    private void generateNumbers(){
        int random;
        for(int i=0; i<24; i++) {
            do {
                random = (int )(Math.random() * 75 + 1);
            } while (contains(cardNumbers, random));
            cardNumbers[i] = random;
        }
    }
    
    public boolean contains(int[] arr, int item) {
      for (int n : arr) {
         if (item == n) {
            return true;
         }
      }
      return false;
   }
    
    public boolean stampNumber(int n) {
        if(contains(cardNumbers, n)) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public int getNoStamp() {
        
        return noStamp;
    }
    
}