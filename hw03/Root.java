//Matt Kawa
//September 12, 2014
//  CSE2
//  Homework 03
//  Cube Root program

//Estimates cube root of a double entered by the user

//import scanner class
import java.util.Scanner;

//define class for Root program
public class Root {
    //define main method
    public static void main(String[] args)  {
        
        //declare instance of/construct scanner
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user for input
        System.out.print("Enter a double and I print its cube root: ");
        //store input as double
        double x0 = myScanner.nextDouble();
        
        //function to find rough estimate of cube root:
        //for first guess: (x1) = x0/3
        double x1 = x0/3; 
        //System.out.println(x1);
        
        //for subsequent guesses:
        //f(xN) = x(N-1) - [x(N-1) * x(N-1) * x(N-1) - x0] / [3* x(N-1) * x(N-1)]
        double x2 = x1 - (x1*x1*x1-x0)/(3*x1*x1);
        //System.out.println(x2);
        double x3 = x2 - (x2*x2*x2-x0)/(3*x2*x2);
        //System.out.println(x3);
        double x4 = x3 - (x3*x3*x3-x0)/(3*x3*x3);
        //System.out.println(x4);
        double x5 = x4 - (x4*x4*x4-x0)/(3*x4*x4);
        //System.out.println(x5);
        double x6 = x5 - (x5*x5*x5-x0)/(3*x5*x5);
        
        double check = x6*x6*x6;
        System.out.println("The cube root is "+x6+":");
        System.out.println(x6+" * "+x6+" * "+x6+" = "+check);
        
    }//end main method
}//end class
