//Matt Kawa
//September 21, 2014
//  CSE2
//  Homework 04
//  Month Program

//  prompts the user for a month number and returns the number of days in the given month   

import java.util.Scanner; //import scanner class

public class Month { //define class
    public static void main(String[] args) { //define main method
    
    //declare/construct instance of scanner
    Scanner myScanner = new Scanner (System.in);
    
    //declare variables
    int month;
    int days = 31;
    int year = 2014;
    double leapYear;
    
    //prompt user for input
    System.out.print("Enter an int giving the number of the month (1-12)- ");
    if(myScanner.hasNextInt()) { //if int
        month = myScanner.nextInt(); //store input
    } else { //if not int
        System.out.println("You did not enter an int");
        return; //exit program
    }
    
    if(month < 1 || month > 12) { //if invalid
        System.out.println("You did not enter an int between 1 and 12");
        return;
    }
    
    //return number of days based on month entered
    //30 days hath september, april, june, and november...
    if(month == 9 || month == 4 || month == 6 || month == 11) {
        days = 30;
    } 
    
    // ...all the rest have 31...
    
    // ...except for february.
    if (month == 2) {
        System.out.print("Enter an int giving the year- ");
        if (myScanner.hasNextInt()) { //if acceptable input
            year = myScanner.nextInt(); //store year
            leapYear = year / 4.0; //divide by 4
            if(leapYear == year/4) { //if leap year
                days = 29;
            } else { //if not leap year
                days = 28;
            }
        } else {
            System.out.println("You did not enter a valid year");
            return;
        }
    }
    
    System.out.println("The month has "+days+" days");
    } //end main method
} //end class