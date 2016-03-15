/* TRUNK */
package bingo;

import java.util.ArrayList;

public class NumberCollection{
    
    public ArrayList<Number> ncarr = new ArrayList<Number>();
    
    public NumberCollection(){}
    
    public void addNumber(Number n){
        ncarr.add(n);
    }
    
    public boolean containsNumber(Number n){
        return ncarr.contains(n);
    }
    
    public boolean containsCollection(NumberCollection nc){
        return false;
    }
    
    public int count(){
        return 0;
    }
    
    public Number get(int index){
        
        Number nu = new Number(index);
        return nu;
        //return this;
    }
    
}
