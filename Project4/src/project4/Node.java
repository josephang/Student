package project4;
public class Node {
    private int item;
    private Node next = null;
    
    public Node (int nItem){
        this.item = nItem;
    }
    
    public Node (int nItem, Node nNode){
        this.item = nItem;
        this.next = nNode;
    }
    
    public Object getItem(){
        return this.item;
    }
    
    public Node getnNode(){
        return this.next;
    }
    
    public void setItem(int nItem){
        this.item = nItem;
    }
    public void setNode(Node nNode){
        this.next = nNode;
    }
}
