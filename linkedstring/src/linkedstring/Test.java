package linkedstring;

public class Test {
    
    public static  void main(String[] args) {
        Node Start = new Node('a');
        String Harambe = "Harambe";
        int index = 4;
        char[] Test = new char[7];
        for(int i = 0; i<=6; i++){
            Test[i] = 'a';
        }
        LinkedString Testing = new LinkedString(Test);
        LinkedString Tester = new LinkedString(Harambe);
        
        Testing.concat(Tester);
        Testing.isEmpty();
        Testing.length();
        Testing.substring(3,6);
        Testing.charAt(index);
    }

}