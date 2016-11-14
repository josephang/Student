package john;

import java.util.Scanner; // Import Scanner Object from java.util Class

public class John { // Class Block Start

	private static boolean passwordLength = false; //if there is eight characters
        
        private static boolean passwordConsistency = true;//if this consists of letters and numbers only

		
    public static void main(String[] args) { // Main Method Start
        
        Scanner input = new Scanner(System.in); // Create Scanner Object
        
        // Variable Decleration & Initialization
        
        String userPassword;
        
        String passwordCheck;
        
        String secondCheck;
        
        String thirdCheck;
        
        String passwordLengthCheck;
        
       
        
        // Ask User to Generate & Input Password
        
        System.out.println("Please create a password that conforms to the "
                
                + "following criterions.");
        
        System.out.println("1.) The password must have at least eight characters");
        
        System.out.println("2.) The password must consist of only letters and digits");
        
        System.out.println("3.) The password must contain at least two digits.");
        
        System.out.println("Please enter your password: ");
        
        userPassword = input.next();
        
        // Call checkPassword() Method
        
        checkPassword (userPassword);
        
        
        if (passwordLength == true){
            
            if (passwordConsistency == true){
                
                System.out.println("Valid Password!");
            }
        }
        else{
                System.out.println("Invalid Password!");
        }
    } // Main Method End
    
    public static void checkPassword(String passwordCheck) { // checkPassword Method Block Start

     if(passwordCheck.length() >= 8) { // First If Block Start
         
         passwordLength = true;
         
        }
     for(int i = 0; i < passwordCheck.length(); i++){
         
         if(Character.isLetterOrDigit(passwordCheck.charAt(i)) == false){
             
             passwordConsistency = false;
         }
     }

    } // checkPassword Method Block End
       
} // Class Block End