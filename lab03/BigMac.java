//Matt Kawa
//September 12, 2014
//  CSE2
//  Lab 03
//  Big Mac program

//Calculates the cost of Big Macs based on user input

//import scanner class
import java.util.Scanner;
//scanner obtains input from user

//define class for BigMac program
public class BigMac {
    //define main method
    public static void main(String[] args) {
        
        //declare instance of scanner
        Scanner myScanner;
        //call Scanner constructor
        myScanner = new Scanner ( System.in );
        
        //now ready to accept user input
        //prompt user for number of tickets
        System.out.print(  //"println" breaks line after printing, "print" does not
        "Enter the number of Big Macs (an integer > 0): ");
        //use scanner to accept next integer entered by user
        int nBigMacs = myScanner.nextInt();
        
        //prompt user for cost of Big Mac
        System.out.print("Enter the cost per Big Mac as"+
        " a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble(); //accept next double entered by user as cost
        
        //prompt user for tax rate
        System.out.print(
        "Enter the percent tax as a whole number (xx): ");
        //accept input for tax rate and convert to from percentage to proportion
        double taxRate = myScanner.nextDouble();
        taxRate/=100;
        
        //calculate final cost
        double cost$;
        int dollars, //whole dollar amount of cost
            dimes, pennies; //for storing digits right of decimal point
                            //for the cost$
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //get whole amount, dropping decimal fraction
        dollars=(int)cost$;
        //get dimes amount, e.g.,
        //  (int)(6.73*10 % 10 -> 67 % 10 -> 7)
        //  where the % (mod) operator returns the remainder
        //  after the division: 583%100 -> 83, 27%5 -> 2
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs
        + " Big Macs, at $"+bigMac$+" per Big Mac, with a " +
        "sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+"."+dimes+pennies);
        
    } //end main method
} //end class
