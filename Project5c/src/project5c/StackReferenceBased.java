package project5c;
public class StackReferenceBased<i>{
    private Node top;
    
    public StackReferenceBased(){
        top = null;
    }
    public boolean isEmpty(){
        return this.top == null;
    }
    public void push(Input newItem){
        this.top = new Node(newItem, this.top);
    }
    public Node NextNode(){
        return this.top.getNxtNode();
    }
    public Node thisNode(){
        return this.top;
    }
    public void pop() throws StackException {
        if(!isEmpty()){
            //Node temp = top;//this is if you wanna keep the head of the stack
            this.top = this.top.getNxtNode();
        }
        else{
            throw new StackException("Stack Exception on pop: stack empty");
        }
    }
    public void popAll(){
        this.top = null;
    }
    public Input peek() throws StackException {
        if (!isEmpty()){
            Input item = this.top.getItem();
            return item;
        }
        else{
            throw new StackException("Stack Exception on pop: stack empty"); 
        }
    }
}
