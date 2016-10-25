import java.util.Scanner;

public class Project1Problem1forAlex { 
    static int base = 2;
    
    public static double power1(double n) {
        double result = 1;// 
        
        if (n == 0) {
            return 1;
        }
        else if (n == 1) {
            return base;
        }
        else { 
          for (int i = 0; i < n; i++) {
              result = base * result;
        }
        return result;
        }
    }
    
    public static double power2(int n) {
        if (n == 0)
            return 1;
        else
            return base * power2(n-1); 
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a program which will raise the number 2 increasing values of n up to n = 32");   
        for (int i = 0; i <= 32; i++) {
        System.out.println("Using the ITERATIVE method, " + base + " to the " + i + " power is " + power1(i));
        System.out.println("Using the RECURSIVE method, " + base + " to the " + i + " power is also " + power2(i));
        }
    }
    
}