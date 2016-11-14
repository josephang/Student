/*
Joseph Ang
CompSci 182
Professor Riviera
 */
package project5a;
public class Project5a {

    public static void main(String[] args) {
        
        Pen Lamy = new Pen("Blue", false);
        Lamy.color();
        Lamy.isBall();
        Lamy.write("First text");
        Lamy.write("Second text");
        Lamy.write("Last text before empty");
        System.out.println(Lamy.isEmpty());
        Lamy.write("garbage");
        Lamy.write("garbage");
        Lamy.refill();
        Lamy.write("I refilled it. YAY!");
    }
    
}
