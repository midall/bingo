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
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPid() {
        this.pid = ai_pid;
    }
    
    public int getPid() {
        return this.pid;
    }
    
    public void newCard() {
        bingoc.add(new BingoCard());
    }
    
    public int countCards() {
        return bingoc.size();
    }
    
}
