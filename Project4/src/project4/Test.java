package project4;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        int place = 0;
        boolean go = true;
        
        System.out.println("I will take in all integers you type until you input '-1'.");
        System.out.println("Please enter item number " + place);
        
        Scanner input = new Scanner(System.in);
        int Int = input.nextInt();
        if(Int == -1){
            go = false;
        }
        Node basket = new Node(Int);
        Queue nQueue = new Queue(basket);
        place++;
        
        while(go == true){
        System.out.println("Please enter item number " + place);
        Scanner input1 = new Scanner(System.in);
        int Int1 = input1.nextInt();
        if(Int1 == -1){
            go = false;
            break;
        }
        place++;
        Node basket1 = new Node(Int1);
        nQueue.enqueue(basket1);
        
        }
        System.out.println("end");
        System.out.println("length is " + nQueue.length()); 
        System.out.println("is the Queue empty? " + nQueue.isEmpty());
        System.out.println("what is the head? " + nQueue.getHead().getItem());
        System.out.println("what is the tail? " + nQueue.getTail().getItem());
        for(int i = 0; i < place; i++){
           
           System.out.println("The " + i +" number in the list is " + nQueue.peek().getItem());
           System.out.println("is the Queue empty? " + nQueue.isEmpty());
           System.out.println("length is " + nQueue.length());
           nQueue.dequeue();
        }
        System.out.println("is the Queue empty? " + nQueue.isEmpty());
        System.out.println("length is " + nQueue.length()); 
    }
}
//System.out.println("");