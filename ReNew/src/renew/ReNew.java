package renew;
import java.util.Scanner;

public class ReNew{
    Scanner input = new Scanner(System.in);
    
    // This is the method for Addition, Code By: QUEL
    public void addition(){
        int num1Add, num2Add, sum;
        
        System.out.println("Enter 2 numbers to add");
        System.out.print("First Number: ");
        num1Add = input.nextInt();
        System.out.print("Second Number: ");
        num2Add = input.nextInt();
        sum = num1Add + num2Add;
        
        System.out.println("The sum is: " + sum);
    }
    
    // This is the method for Subtraction
    
    public void subtraction(){
    
    }
    
    
    
    // This is the method for Multiplication
    
    /*write your code here!*/
    
    
    
    // This is the method for Division
    
    /*By Rashed*/
    public static void division(){
        int nOne, nTwo;
        Scanner kb = new Scanner(System.in);

        System.out.println("Division");

        System.out.print("\nFirst Number: ");
        nOne = kb.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = kb.nextInt();

        kb.close();
        System.out.println("\nSum: " + nOne + " / " + nTwo + " = " + (nOne / nTwo));
    }
    
    
    
    public static void main(String[]Args){
        ReNew object = new ReNew();
        object.addition(); //calling the method addition
    }
}
