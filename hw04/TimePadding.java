//Matt Kawa
//September 21, 2014
//  CSE2
//  Homework 04
//  Time Padding Program

//  converts number of seconds elapsed in a day to conventional "padded" time format

import java.util.Scanner; //import scanner class

public class TimePadding { //define class
    public static void main(String[] args) { //define main method
    
    //declare/construct instance of scanner
    Scanner myScanner = new Scanner (System.in);
    
    //declare variables
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    
    //prompt user for input
    System.out.print("Enter the time in seconds: ");
    if(myScanner.hasNextInt()) {
        seconds = myScanner.nextInt(); //store input
    } else { //if not int
        System.out.println("You did not enter an int");
        return;
    }
    
    //calculate hours/minutes
    hours = seconds / 3600;
    minutes = (seconds - 3600 * hours) / 60;
    seconds = seconds - (hours * 3600) - (minutes * 60);
    System.out.print("The time is "+hours+":");
    if(minutes < 10) { //if padding necessary
        System.out.print("0"+minutes+":"); //print padded
    } else {
        System.out.print(minutes+":"); //print w/o extra 0
    }
    if(seconds < 10) { //if padding necessary 
        System.out.println("0"+seconds); //print extra 0 for padding
    } else {
        System.out.println(seconds); //print normally
    }
    
    } //end main method
} //end class