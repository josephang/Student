package chessproblem;

import java.util.Scanner;

public class ChessProblem {
    
    //so what im thinking is creating an environment object, int[8][8] full of 0s
    //then creating a queen object that when placed, turns all the squares its attacking into 2s
    //then we make sure the queen can only be placed on 0s.
    //then we place queens until we reach 8.
    
    public static void main(String[] args) {
       Environment nboard =  new Environment();
       Solution thisProblem = new Solution();
       int counter = 1, solutions = 0, numOsol = 4; boolean looking = true;
       System.out.println("Please enter how many solutions I should find.");
       Scanner input = new Scanner(System.in);
       numOsol = input.nextInt();
      while(looking == true){
        int i = (int)(Math.random() * (9 - 1) + 1);
        int j = (int)(Math.random() * (9 - 1) + 1);
                        
                        if(nboard.PlaceQueen(i,j) == true){
                            nboard.PlaceQueen(i,j);
                            thisProblem.addQueen();
                             
                        }
                        if(thisProblem.getQueens()== 8){
                            solutions++;
                            System.out.println("A Solution has been generated." + " Tried " + counter  + " times.");
                            nboard.display();
                            if(solutions == numOsol){
                            looking = false;
                            break;
                            }
                        }
                        if(nboard.hasNoMoreSolutions() == true){
                            nboard.clearBoard();
                            thisProblem.clearQueens();
                            counter++;
                        }  
                        
      }
       System.out.println("I placed " + thisProblem.getTQueens() + " queens in total and tried on " + counter +" different boards.");
       System.out.println("I produced " + numOsol + " possible arrangement(s).");
       
    }
    
}
