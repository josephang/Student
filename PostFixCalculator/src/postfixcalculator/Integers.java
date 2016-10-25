package postfixcalculator;
public class Integers {
    private int item;
    private Integers next = null;
    
    public Integers(int nItem){
        this.item = nItem;
    }
    public Integers(int nItem, Integers nNext){
        this.item = nItem;
        this.next = nNext;
    }
    public int thisItem(){
        return this.item;
    }
    public void setnextInt(Integers nInt){
        this.next = nInt;
    }
    public Integers nextInt(){
        return this.next;
    }
}
