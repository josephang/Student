package project5c;
public class Node{
    private Input item;
    private Node next;
    
    public Node(Input nItem){
        this.item = nItem;
        this.next = null;
    }
    public Node (Input nItem, Node nNode){
        this.item = nItem;
        this.next = nNode;
    }
    public Input getItem(){
        return this.item;
    }
    public Node getNxtNode(){
        return this.next;
    }
    public void setItem(Input nItem){
        this.item = nItem;
    }
    public void setNxtNode(Node nNode){
        this.next = nNode;
    }
}
