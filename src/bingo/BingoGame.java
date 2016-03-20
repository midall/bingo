/* TRUNK */
package bingo;

import java.util.HashMap;
import java.util.Map;

public class BingoGame {
    Map<Integer, Boolean> numberTable;
    
    public BingoGame(){
        this.numberTable = new HashMap<Integer, Boolean>();
        generateTable();
    }
    
    private void generateTable(){
        for(int i=1; i<=75; i++) {
            numberTable.put(i, true);
        }
    }
    
    public int getNextNumber(){
        
        int random;
        do {
            random = (int )(Math.random() * 75 + 1);
            //System.out.println(random);
        } while (numberTable.get(random) == false);

        numberTable.put(random, false);
        return random;
    }
    
}
