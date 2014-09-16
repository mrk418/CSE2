//Matt Kawa
//September 12, 2014
//  CSE2
//  Homework 03
//  Bicycle program

//Calculates various data about a bicycle ride based on user input

//import scanner class
import java.util.Scanner;
//scanner obtains input from user

//define class for Bicyle program
public class Bicycle {
    //define main method
    public static void main(String[] args) {
        
        //declare instance of scanner
        Scanner myScanner;
        //call Scanner constructor
        myScanner = new Scanner ( System.in );
        
        //prompt user for number of counts
        System.out.print("Enter the number of counts from the cyclometer: ");
        //store next integer entered as number of counts
        int nCounts = myScanner.nextInt();
        
        //prompt user for length of ride (in seconds)
        System.out.print("Enter the time the ride took in seconds: ");
        //store next integer as number of seconds
        int nSeconds = myScanner.nextInt();
        
        //define constants to be used in calculations
        double WheelDiameter = 27.0;
        double PI = 3.14159;
        int FeetPerMile = 5280;
        int InchesPerFoot = 12;
        int SecondsPerMinute = 60;
        
        //calculate rounded distance
        double RoundedDistance = (int)(nCounts*PI*WheelDiameter/InchesPerFoot/FeetPerMile*100);
        RoundedDistance /= 100;
        //calculate integer number of minutes
        System.out.println(nSeconds);
        System.out.println(SecondsPerMinute);
        double nMinutes = nSeconds/SecondsPerMinute;
        double AverageSpeed = RoundedDistance/(nMinutes/60);
        
        //calculate and display final data about ride
        System.out.println("The distance was " +
        RoundedDistance +
        " miles and took " +
        nMinutes +
        " minutes.");
        //calculate and display average speed (rounded to 2 decimal places)
        double RoundedSpeed = (int)(AverageSpeed*100);
        RoundedSpeed /= 100;
        System.out.println("The average MPH was "+
        RoundedSpeed);
        //////////////////////
        //ROUND SPEED
        //CHECK COMPUTATIONS
        /////////////////////
        
        
    } //end main method
}  //end class
        