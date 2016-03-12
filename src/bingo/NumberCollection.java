package bingo;

public class NumberCollection{
    public NumberCollection(){}
    
    public void addNumber(Number n){}
    
    public boolean containsNumber(Number n){
        return false;
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
