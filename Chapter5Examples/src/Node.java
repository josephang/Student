/*
 * File: Node.java
 * Programmer: Benjamin Riveira
 * Description: This is a generic Node class which can be used to
 * store any type of Java object.
 *
 */
class Node {
   Object item;
   Node next;
   
   Node(Object newItem) {
      item = newItem;
      next = null;
   } // end constructor
   
   Node(Object newItem, Node nextNode) {
      item = newItem;
      next = nextNode;
   } // end constructor 
} // end class Node