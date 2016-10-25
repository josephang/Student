package chessproblem;
public class Solution {
    private boolean solved = false;
    private int queens = 9;
    private int totalQueens = 1;
    
    public Solution(){
        this.queens = 0;
    }
    public void addQueen(){
        this.queens++;
    }
    public void clearQueens(){
        this.totalQueens = this.queens + this.totalQueens;
        this.queens = 0;
    }
    public int getQueens(){
        return this.queens;
    }
    
    public int getTQueens(){
        return this.totalQueens;
    }
    public boolean isSolved(){
        if(this.queens == 8){
        this.solved = true;
        }
        return this.solved;
    }
}
