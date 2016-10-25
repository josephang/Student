//Joseph Ang

package linkedstring;
public class LinkedString {
private Node head = null;
private Node curr = null;

public LinkedString(char[] value){//turns char[] into a linked list
    
    Node newLinkedString = new Node(value[0]); //creating new node newLinkedString
    
    head = newLinkedString;//head now references he newLinkedString
    
    for(int i = 1; i < value.length; i++ ){//creating a loop that can add items to the LinkedString
   
        Node newNode = new Node(value[i]);//A new node is created
   
        newLinkedString.setNodeNext(newNode);//The newLinkedString.next variable now references newNode
    }

    }


public LinkedString(String original){//Creating a char[] that is a copy of another Linked List
    
    char[] newCharArray = original.toCharArray(); //turning String original to Char[] newCharArray
   
    LinkedString nLinkedString = new LinkedString(newCharArray);
}

public char charAt(int index){// find the char value a speciied index
    char thecharacter = 'a'; //intialize and declare character7077 
    
    this.head = this.curr; //moving up the LinkedList by going to the reference variable
    
    for(int i = 0; i < index; i++){//moving through the LinkedString and stops at index
    
    this.curr = this.curr.getNodeNext();
    
    thecharacter = this.curr.getNodeChar();//setting character reference as the value in the item 
    
    }
    
    return thecharacter;//return the character
}

public LinkedString concat(LinkedString str){
    //adds two LinkedStrings together
    boolean go = true;
    int size = 0;
    this.curr = this.head;
    while( this.curr.getNodeNext() != null){ //runs through the linked list
        this.curr = this.curr.getNodeNext();
        }
    this.curr.setNodeNext(str.head);
    return this;//return the new LinkedString wih a new length
}

public boolean isEmpty(){
    boolean bool = false;
    if(this.length() == 0){//uses length() to determine length
        bool = true;//if the length is 0, bool is changed to true
    }
    return bool;//returns true if the length returned is not zero
}

public int length(){
    int size = 0;//creating integer variable to record size
 
        for(this.curr = this.head; this.curr.getNodeNext() != null; this.curr = this.curr.getNodeNext()){ //runs through the linked list
             size++; //increments size whenever it runs through the loop 
        }
        
    return size;//returns the number of items in the array
}

public LinkedString substring(int beginIndex, int endIndex){
    boolean letsgo = true;
    int index = 0, size = 0;
    
    size = this.length();
    
    char[] substring = new char[size];//creates a char array with the size of Original's Linked List
    this.head = this.curr;
    while(letsgo == true){//moving through the LinkedString and stops at index
        
    this.curr = this.curr.getNodeNext();//moving up the LinkedList by going to the reference variable
    
        if(index >= beginIndex && index <= endIndex){//if index is in the range of our substring
            substring[index] = this.curr.getNodeChar();//setting character reference as the value in the item 
             index++;//increment index
             }
        if(index == size){
            letsgo = false;
        }
    }
    LinkedString Substring = new LinkedString(substring);//create a LinkedString from our char[]
    return  Substring;//return the new LinkedString Substring
}
}