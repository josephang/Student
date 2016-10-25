package calculatorpostfix;

import java.util.Scanner;

public class CalculatorPostFix {
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static StackReferenceBased makeStack(){
        boolean go = true;
        StackReferenceBased Stack = new StackReferenceBased();
        System.out.println("Please Enter single digit numbers in PostFix Form separated by spaces.");
        System.out.println("Type 'calculate' when you are finished.");
        while(go == true){
            Scanner input = new Scanner(System.in);
            Input nInput = new Input(input.next());
            
            if("calculate".equals(nInput.getString())){
                go = false;
                break;
            }
            if(nInput.isInt() == false){//will take operands
                char Operand = nInput.charConvert();
                Input nOperand = new Input(Operand);
                Stack.push(nOperand);
            }
            if(nInput.isInt() == true){//will take in integers and convert string type to int
                nInput = nInput.intConvert();//converts type to int
                Stack.push(nInput);//adds int to stack
            }
        }
        return Stack;
  }
}
