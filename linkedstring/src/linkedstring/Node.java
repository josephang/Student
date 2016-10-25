package linkedstring;
public class Node {
    private char item; //can be Object
    private Node next;
    
    public Node(char newItem){
        item = newItem;
        next = null;
    } //end of constructor
    
     public Node(char newItem, Node nextNode){
        item = newItem;
        next = nextNode;
    } //end of constructor
     
    public Node getNode(){
        return this;
    }
    
    public char getNodeChar(){
        return this.item;
    }
    
    public Node getNodeNext(){
        return this.next;
    }
    
    public void setNodeChar(char nItem){
        this.item = nItem;
    }
    
    public void setNodeNext(Node nNode){
        this.next = nNode;
    }

}
