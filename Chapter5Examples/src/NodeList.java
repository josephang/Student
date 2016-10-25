/*
 * File: NodeList.java
 * Programmer: Benjamin Riveira
 * Description: This is a driver program that creates a linked list of
 * generic Node objects.
 *
 */
public class NodeList {
   public static void main(String[] args) {
      Node n = new Node(new Integer(6));
      Node first = new Node(new Integer(9), n);
      
      System.out.println(first.item + " " + first.next.item);
   }
}