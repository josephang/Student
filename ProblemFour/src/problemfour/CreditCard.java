package problemfour;
import java.util.Scanner;

public class CreditCard {
    private String Name, NDD;
    private long ACCN;
    private int Reward;
    private double Balance;
    
    
    public static void main(String[] args) {
        String nombre, nxtdd;
        long accn = 432423542;
        int rpoint = 1;
        double balance = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter Name");
        nombre = input.next();
        System.out.println("Please Enter Account Number");
        accn = input.nextLong();
        System.out.println("Please Enter Next Due Date MM/YY");
        nxtdd = input.next();
        System.out.println("Please Enter Reward Points");
        rpoint = input.nextInt();
        System.out.println("Please Enter Balance");
        balance = input.nextDouble();
        //Testing
        CreditCard card = new CreditCard(nombre,accn,nxtdd,rpoint,balance );
    }
   
    public CreditCard(String name, long accn, String ndd, int rp, double balance){
        Name = name;
        ACCN = accn;
        NDD = ndd;
        Reward = rp;
        Balance = balance;
    }
    
    public void charge(double sub){
        Balance -= sub;
    }
    
    public void cashAdvance(double add){
        Balance += add;
    }
    
    public void makePayment(double sub){
        Balance -= sub;
    }
    
    public void addInterest(double add){
        Balance += add;
    }
    
@Override
    public String toString(){
        String stats = "This account belongs to: " + Name + " The account number is: " + ACCN + 
                " The next due date is " + NDD + " The number of reward points is " + Reward + " The balance is " + Balance;
        
        System.out.println(stats);
        return stats;
    }
    
}

 