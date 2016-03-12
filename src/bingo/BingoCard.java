/* TRUNK */
package bingo;
import java.util.ArrayList;

public class BingoCard {
    //private int[] cardNumbers = new int[24];
    //NumberCollection nc  =new NumberCollection();
    private ArrayList<Integer> cardNumbers = new ArrayList<Integer>();
    
    public BingoCard(){
        generateNumbers(24);
    }
    
    private void generateNumbers(int n){
        
    }
    
    public void stampNumber(int n){}
    
    public boolean containsNumber(int n){
        return false;
    }
    
    public int numbersStamped(){
        return 0;
    }
    
    public NumberCollection numberMissing(){
        NumberCollection nc  =new NumberCollection();
        return nc;
    }
    
    
    
}
