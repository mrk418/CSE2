//Matt Kawa
//October 14; 201,
//  CSE2
//  Homework 06
//  Square Root Program

//  finds the square root of a number
//  by progressively narrowing the range of number in which the root could lie

import java.util.Scanner; //import scanner class

public class Root {
    public static void main(String args[]) {
        //declare/construct instance of scanner
        Scanner myScanner = new Scanner(System.in);
        
        //declare variables
        double input = 0;
        double high = 0;
        double low = 0;
        double middle = 0;
        
        //prompt user for input
        System.out.print("Enter a double greater than 0- ");
        if (myScanner.hasNextDouble()){
            input = myScanner.nextDouble();
            if (input < 0){
                System.out.println("Your double was not >= 0");
            }
        } else {
            System.out.println("You did not enter a double");
        }
        
        //perform calculation
        high = input + 1;
        while((high-low)>=.0000001){
            if(middle*middle == input){
                break;
            }
            if(middle*middle > input){
                high = middle;
            }
            if(middle*middle < input){
                low = middle;
            }
            
            middle = .5*(high+low);
        }
        System.out.println("The square root of "+input+" is approximately "+middle);
        
    } //end main method
}//end class