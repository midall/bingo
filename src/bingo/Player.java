/* TRUNK */
package bingo;

import java.util.ArrayList;

public class Player {
    
    static int ai_pid = 0;
    
    private int pid;
    private String name;
    private ArrayList<BingoCard> bingoc = new ArrayList<BingoCard>();
    
    public Player(){
       //BingoCard bc = new BingoCard();
       setPid();
       newCard();
       
    }
    
    //GET NAME
    public String getName() {
        return name;
    }
    
    //SET NAME
    public void setName(String name) {
        this.name = name;
    }
    
    //SET PLAYER ID
    public void setPid() {
        ai_pid++;
        this.pid = ai_pid;
    }
    
    //GET PLAYER ID
    public int getPid() {
        return this.pid;
    }
    
    //CREATE A NEW BINGO CARD
    public void newCard() {
        bingoc.add(new BingoCard());
    }
    
    //COUNT PLAYERS CARD
    public int countCards() {
        return bingoc.size();
    }
    
    //NEW NUMBER
    public void newNumber(int n){
        for (BingoCard bc_item : bingoc) {
            bc_item.stampNumber(n);
        } 
        
    }
    
    //CHECK IF BINGO
    public boolean isBingo(BingoCard bc){
        
        if(bc.getNoStamp() == 24) {
            return true;
        } else {
            return false;
        }
    }
    
}
