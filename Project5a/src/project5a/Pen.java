package project5a;
public class Pen {
    private boolean Ball;
    private String Color;
    private int ink = 75;
    
    public void isBall(){
        if(Ball == true){
        System.out.println("This is a ball point pen");
        }
        if(Ball == false){
        System.out.println("This is not a ball point pen ");
        }
    }
    public Pen(String C, boolean f){
        this.Color = C;
        this.Ball = f;
    }
    public void color(){
        System.out.println("The color of this pen is " + this.Color);
    }
    public void refill(){
        this.ink = 100;
    }
    public void write(String text){
        if(this.ink >= 25){
            System.out.println(text);
            this.ink = this.ink - 25;
        }
        else{
           System.out.println("Not enough ink. Please refill."); 
        }
    }
    public boolean isEmpty(){
        if(this.ink > 0){
            return false;
        }
        else{
        return true;
        }
    }
}
