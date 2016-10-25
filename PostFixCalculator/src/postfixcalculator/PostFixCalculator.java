package postfixcalculator;
import java.util.Scanner;
public class PostFixCalculator {
    private static double result = 0;
    public static void main(String[] args) throws StackException {
        StackReferenceBased Stack = makeStack();//Stack with operands and values

        Operations operation = extractOperations(Stack);//places operations into linked list
        //System.out.println(operation.thisItem());
        
        Integers integer = extractIntegers(Stack);//places integers into a linked list
        System.out.println("Running Switch");
        double answer = runSwitch(operation, integer);
        System.out.println("The answer is " + answer);
    }
    public static double runSwitch(Operations Op, Integers Int){
        int operate = 0;
        Integers traverse = Int; Operations travel = Op;
        double num1 = Int.thisItem(), num2 = Int.nextInt().thisItem(), result1 =0;
        char nOp;
        System.out.println(Op.isEmpty());
        System.out.println(Op.thisItem());
        nOp = Op.thisItem();
        while(Op.isEmpty() == false){
        
        //System.out.println(Op.nextOp().thisItem());
        operate = whatOperation(nOp);
        switch(operate){
            case 1:  result1 = addition(num1,num2);System.out.println(result1);
                     break;
            case 2:  result1 = subtraction(num1,num2);System.out.println(result1);
                     break;
            case 3:  result1 = multiplication(num1, num2);System.out.println(result1);
                     break;
            case 4:  result1 = remainder(num1, num2);System.out.println(result1);
                     break;
            case 5:  result1 = division(num1, num2);System.out.println(result1);
                     break;
        }
        try {travel = travel.nextOp();
            nOp = travel.thisItem();
        }
        catch(NullPointerException e){
            break;
        }
        
        num1 = result1;
        System.out.println(Op.nextOp().thisItem());
        
        traverse = traverse.nextInt();
        num2 = traverse.nextInt().thisItem();
        System.out.println(num2);
        
        }
        return result1;
    }
    public static double addition(double num1, double num2){
        double num3 = num1+num2;
        return num3;
    }
    public static double subtraction(double num1, double num2){
        double num3 = num1-num2;
        return num3;
    }
    public static double multiplication(double num1, double num2){
        double num3 = num1*num2;
        return num3;
    }
    public static double remainder(double num1, double num2){
        double num3 = num1%num2;
        return num3;
    }
    public static double division(double num1, double num2){
        double num3 = num1/num2;
        return num3;
    }
    public static int whatOperation(char O){
        if(O == '+')
            return 1;
        if(O == '-')
            return 2;
        if(O == '*')
            return 3;
        if(O == '%')
            return 4;
        if(O == '/')
            return 5;
        return 6;
    }
    public static Operations extractOperations(StackReferenceBased nStack) throws StackException {
        Operations operationsList = new Operations(nStack.peek().getChar());
        Operations head = operationsList;
        System.out.println("head made op" + nStack.peek().getChar());
        nStack.pop();
        System.out.println("popped outside op");
        while(nStack.NextNode().getItem().isInt() == false){
            Operations nOperation = new Operations(nStack.peek().getChar());
            nOperation.setnextOp(operationsList);
            head = nOperation;
            operationsList = nOperation;
            System.out.println("cycling op" + nStack.peek().getChar() );
            if(nStack.NextNode().getItem().isInt() == false){
                nStack.pop();
                System.out.println("popped inside op");
                break;
            }
        }
        return head;
    }
    
    public static Integers extractIntegers(StackReferenceBased nStack) throws StackException {
        Integers integersList = new Integers(nStack.peek().getInt());
        Integers head = integersList;
        System.out.println("head made int" + nStack.peek().getInt());
        nStack.pop();
        System.out.println("popped outside int");
        
        while(nStack.thisNode().getItem() != null){
            
                Integers nInteger = new Integers(nStack.peek().getInt());
                integersList.setnextInt(nInteger);
                integersList = nInteger;
                System.out.println("cycling int" + nStack.peek().getInt());
                
                if(nStack.thisNode().getNxtNode() == null){
                System.out.println("stop pls");
                break;
                }
                nStack.pop();
                System.out.println("popped inside int");
        } 
        return head;
    }

  public static StackReferenceBased makeStack(){
        boolean go = true;
        StackReferenceBased Stack = new StackReferenceBased();
        System.out.println("Please Enter single digit numbers in PostFix Form separated by returning.");
        System.out.println("Type 'calculate' when you are finished.");
        while(go == true){
            Scanner input = new Scanner(System.in);
            Input nInput = new Input(input.next());
            
            if("calculate".equals(nInput.getString())){//stops making stack
                go = false;
                System.out.println("done calc");
                break;
            }
            if(nInput.isInt() == false){//will take operands
                char Operand = nInput.charConvert();//converts string nInput to char Operand
                Input nOperand = new Input(Operand);//puts Operand into Input type nOperand 
                Stack.push(nOperand);//puts nOperand into Stack
                System.out.println("op" + nOperand.getChar());
            }
            if(nInput.isInt() == true){//will take in integers and convert string type to int
                nInput = nInput.intConvert();//converts type to int
                Stack.push(nInput);//adds int to stack
                System.out.println("int" + nInput.getInt());
            }
        }
        return Stack;
    }
}
