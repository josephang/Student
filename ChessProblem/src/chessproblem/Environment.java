package chessproblem;

public class Environment {
    private static final int size = 8;
    private final char[][] board = new char[8][8];
    
    public Environment(){
        char o = ' ';
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        this.board[i][j] = o;
                    }
                }
    }
    public void clearBoard(){
        char o = ' ';
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        this.board[i][j] = o;
                    }
                }
    }
    public char[][] getBoard(){
        return this.board;
    }
    public void display(){
      char[][] Array = this.board;
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print(" [" +Array[i][j] +"]");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
    }
    public int Size(){
        return this.size;
    }
    public boolean PlaceQueen(int x, int y){
        char Q = 'Q', X = 'x', o = ' ';
        x = x - 1;
        y = y - 1;
        int w = x + y;
        int v = y - x;
        try{
        if(this.board[x][y] == o){
        for (int i = 0; i < size; i++) { //places rook movement on queen
                    for (int j = 0; j < size; j++) {
                        if( j == y || i == x ){
                        this.board[i][j] = X;
                        }
                    }
                }
        for (int i = 7; i > -1; i--) {//places negative bishop movement
                    for (int j = 0; j < size; j++) {
                        if( i -v == j ){
                        //if(i + v < 8 && j + 1 < 8 && i - v > -1 && j - v > -1)<--- test formula
                        this.board[j][i] = X;
                        }
                    } 
                }
       for (int i = 0; i < size; i++) {//places positive bishop movement on queen
                    
                    for (int j = 7; j >=0; j--) {
                        if(  j - w  == i ){
                        this.board[i][j] = X;
                        } 
                    }
                    w = w -2;
                }
        this.board[x][y] = Q;
        return true;
        }
        else{
            /*System.out.println("This is not a valid location, please choose another coordinate.");
            System.out.println("                   Nothing has changed");
            System.out.println(" ");   <--- Testing and error checking*/
            return false;
        }
        }
        catch(ArrayIndexOutOfBoundsException j){
            System.out.println("error caught");
            return false;
        }
    }
    public boolean hasNoMoreSolutions(){
        char o = ' ', Q = 'Q', X = 'x';
        int solution = 0;
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if(this.board[i][j] == Q ||this.board[i][j] == X){
                            solution++;
                        }
                    }
                }
                if(solution == 64 ){
                    return true;
            }
                return false;
    }
}
