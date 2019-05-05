
package calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String playAgain = "Y";
        double num1, num2;
        String choice;
        DecimalFormat decimalInput = new DecimalFormat("0.00"); 
        Scanner input = new Scanner(System.in);
        
       /*When user choose Y program continues to ask for the two numbers */ 
        while (playAgain.equals("Y")){
        System.out.println("Please enter two numbers");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        
        /*Asking user what kind of calculations wants to do */
        System.out.println("Please enter one of the operations: +, -, *, / ");
        
        /*If use chooses + result will be sum of the two numbers */
        choice = input.next();
        if (choice.equals("+")){
            double sum = num1+num2;
            System.out.println("Your total is: " + decimalInput.format(sum));
        
            /*If user chooses - result will be substraction of num2 from num1 */    
        } else if (choice.equals("-")){
            double subtract = num1-num2;
            System.out.println("Your substraction result is: " +decimalInput.format(subtract));
        
            /*If user chooses * result will be multiplaction of the two numbers */    
        } else if (choice.equals("*")){
            double multiple = num1*num2;
            System.out.println("Your multiplaction result is: " +decimalInput.format(multiple));
           
            /*If user chooses / result will be division of the num1 to num2 */
        } else if (choice.equals("/")){
            double divide = num1/num2;
            System.out.println("Your division result is: " +decimalInput.format(divide));
            
        } else {
             System.out.println("Please choose one of the given operators +, -, *, / ");
        }
        
            /*Asking user if he/she wants to continue to play */
        System.out.println("Do you want to play again? (Y/N)");
        playAgain = input.next();
        
            /*If choice is other than Y, program will tell Bye bye */
        if(!playAgain.contains("Y")){
            System.out.println("Bye bye");
        }
       
    }
    }
}

