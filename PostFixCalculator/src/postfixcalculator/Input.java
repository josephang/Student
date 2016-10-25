package postfixcalculator;
public class Input {
    private int item;
    private char operand;
    private String input;
    public Input(int nItem){
        this.item = nItem;
    }
    public Input(char nOperand){
        this.operand = nOperand;
    }
    public Input(String nOperand){
        this.input = nOperand;
    }
    public boolean isInt(){
        boolean returnme = true;
        try{
        int integer1 = Integer.parseInt(this.input);
        }
        catch(NumberFormatException e){
            returnme = false;
        }
        return returnme;
    }
    public boolean isChar(){
        boolean returnme = false;
        try{
        int integer1 = Integer.parseInt(this.input);
        return returnme;
        }
        catch(NumberFormatException e){
            returnme = true;
        }
        return returnme;
    }
    public Input intConvert(){
        int integer1 = Integer.parseInt(this.input);
        Input nInput = new Input(integer1);
        return nInput;
    }
    public int getInt(){
        return this.item;
    }
    public char charConvert(){
        char[] use = this.input.toCharArray();
        return use[0];
    }
    public String getString(){
        return this.input;
    }
    public char getChar(){
        return this.operand;
    }
}
