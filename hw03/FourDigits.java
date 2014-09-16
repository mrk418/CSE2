//Matt Kawa
//September 12, 2014
//  CSE2
//  Homework 03
//  Four Digits program

//prints the first four digits after the decimal point in a number entered by the user

//import scanner class
import java.util.Scanner;

//define class
public class FourDigits {
    //define main method
    public static void main(String[] args) {
        
        //declare/construct instance of scanner
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user for input
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
        double UserInput = myScanner.nextDouble();
        
        int InputInteger = (int)UserInput; //store integer portion of input
        InputInteger = InputInteger*10000; //multiply integer portion by 10000
        double FourDigits = Math.round(UserInput*10000); //create new variable for final answer = 10000*input number
        FourDigits -= InputInteger; //subtract out integer portion of input
        FourDigits = (int)FourDigits;  //cast final answer to integer
        
        //print final answer one digit at a time
        int FirstDigit = (int)(FourDigits / 1000);
        int SecondDigit = (int)(FourDigits/100 - FirstDigit*10);
        int ThirdDigit = (int)(FourDigits/10 - FirstDigit*100 - SecondDigit*10);
        int FourthDigit = (int)(FourDigits - FirstDigit*1000 - SecondDigit*100 - ThirdDigit*10);
        System.out.println("The four digits are "+FirstDigit+SecondDigit+ThirdDigit+FourthDigit);
        
    }//end main method
}//end class