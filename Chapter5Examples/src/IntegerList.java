/*
 * File: IntegerList.java
 * Programmer: Benjamin Riveira
 * Description: This is a driver program which demonstrates the creation
 * of a linked list consisting of two IntegerNode objects.
 *
 */
public class IntegerList {

   public static void main(String[] args) {
      IntegerNode n1 = new IntegerNode();
      IntegerNode n2 = new IntegerNode();
      
      n1.item = 5; // set item in first node
      n2.item = 9; // set item in second node
      n1.next = n2; // link the nodes
      
      System.out.print(n1.item + " " + n1.next.item);
   }
}