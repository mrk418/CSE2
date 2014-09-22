//Matt Kawa
//September 21, 2014
//  CSE2
//  Homework 04
//  Course Number Program

//  returns information about a given course based on course number from user input

import java.util.Scanner; //import scanner class

public class CourseNumber { //define class
    public static void main(String[] args) { //define main method
    
    //declare/construct instance of scanner
    Scanner myScanner = new Scanner (System.in);
    
    //declare variables
    int courseNumber = 201440;
    int year;
    int intSemester;
    String semester = "semester";
    
    //prompt user for input
    System.out.print("Enter a six digit number giving the course semester- ");
    if(myScanner.hasNextInt()) { //if integer
        courseNumber = myScanner.nextInt();
    } else {
        System.out.println("You did not enter an int");
    }
    if(courseNumber < 186510 || courseNumber > 201440) { //if invalid
        System.out.println("The number was outside the range [186510, 201440]");
        return;
    }
    
    //if valid input
    year = courseNumber / 100; //adapt course number to year
    intSemester = courseNumber - courseNumber / 100 * 100; //adapt course number to semester number
    
    //set string for semester based on semester integer
    if(intSemester == 10) {
        semester = "Spring";
    }
    if(intSemester == 20) {
        semester = "Summer 1";
    }
    if(intSemester == 30) {
        semester = "Summer 2";
    }
    if(intSemester == 40) {
        semester = "Fall";
    }
    
    //print results
    System.out.println("The course was offered in the "+semester+" semester of "+year);
    
    } //end main method
} //end class