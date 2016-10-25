package postfixcalculator;

public class Operations {
    private char item = 'z';
    private Operations next;
    
    public Operations(char nItem){
        this.item = nItem;
    }
    public Operations(char nItem, Operations nOperations){
        this.item = nItem;
        this.next = nOperations;
    }
    public Operations nextOp(){
        return this.next;
    }
    public char thisItem(){
        return this.item;
    }
    public void setnextOp(Operations nNext){
        this.next = nNext;
    }
    public boolean isEmpty(){
        return 'z' == this.item;
    }
}

