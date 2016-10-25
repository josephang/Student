/*
 * File: ResizableArray.java
 * Programmer: Benjamin Riveira
 * Description: This program creates the illusion of a resizable array
 * using fixed-length arrays.
 *
 */
import java.util.Scanner;

public class ResizableArray {
   
   public static void main(String[] args) {
   
      final int MAX_SIZE = 5;
      int count = 0;
      double userInput = 0;
      double[] myArray = new double[MAX_SIZE];
      Scanner input = new Scanner(System.in);
      ResizableArray resize = new ResizableArray();

      while(userInput >= 0) {
      
         if(count == myArray.length) {
            System.out.println("Array bound exceeded, doubling array size...");
            myArray = resize.reSizeArray(myArray, 0);
         }
         
         System.out.print("Enter a double value and I will store it "
                 + "in an array (Enter -1 to exit): ");
         userInput = input.nextDouble();
         if(userInput >= 0) {
            myArray[count] = userInput;
            count++;
         }
         else {
            System.out.println("Array size is: " + myArray.length);
            System.out.println("Values stored in the array: ");
            for(int i = 0; i < myArray.length; i++) {
               System.out.println(myArray[i]);
            }
         }
      }
   }
   public static double[] reSizeArray(double[] oldArray, int capacityIncrement) {
         int capacity = oldArray.length;
               
         if(capacityIncrement == 0) {
            capacity *= 2;
         }
         else {
            capacity += capacityIncrement;
         }
         // now create a new array using the updated
         // capacity value
         double[] newArray = new double[capacity];
         //copy the contents of the original array
         // to the new array
         for(int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
         } // end for
         
         // now return the reference to the new array
         return newArray;

   }
}
