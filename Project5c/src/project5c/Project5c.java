/*
Joseph Ang
CompSci 182
Professor Riviera
 */
package project5c;
public class Project5c {
    public static void main(String[] args) throws StackException {
        Input Number = new Input(10001);
        Node Noder = new Node(Number);
        StackReferenceBased Generics = new StackReferenceBased();
        Generics.push(Number);
        System.out.println(Generics.peek().getInt());
    }
    
}
