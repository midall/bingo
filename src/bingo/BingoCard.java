/* TRUNK */
package bingo;
//import java.util.ArrayList;

public class BingoCard {
    
    static int ai_bcid = 0;
    
    private int BCid;
    private int noStamp;
    private int[] cardNumbers = new int[24];
    
    public BingoCard(){
        generateNumbers();
    }
    
    //SET BINGOCARD ID
    public void setBCid() {
        ai_bcid++;
        this.BCid = ai_bcid;
    }
    
    //GET BINGOCARD ID
    public int getBCid() {
        return this.BCid;
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
    
    public void stampNumber(int n) {
        if(contains(cardNumbers, n)) {
            noStamp++;
        }
    }
    
    public int getNoStamp() {
        
        return noStamp;
    }
    
}