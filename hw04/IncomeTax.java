//Matt Kawa
//September 21, 2014
//  CSE2
//  Homework 04
//  Income Tax Program

//  calculates income tax based on given income and progressive schedule

import java.util.Scanner; //import scanner class

public class IncomeTax { //define class
    public static void main(String[] args) { //define main method
    
    //declare/construct instance of scanner
    Scanner myScanner = new Scanner (System.in);
    
    //declare variables
    int thousands;
    int income;
    int taxRate = 0;
    
    //prompt user for input
    System.out.print("Enter an int giving the number of thousands- ");
    if(myScanner.hasNextInt()) { //if int
        thousands = myScanner.nextInt(); //store input
    } else { //if not int
        System.out.println("You did not enter an int");
        return; //exit program
    }
    
    if(thousands > 0) { //if positive
        income = thousands * 1000; //convert to income
    } else { //if negative or 0
        System.out.println("You did not enter a positive int");
        return;
    }
    
    //assign value to tax rate variable based on income
    if(thousands < 20) {
        taxRate = 5;
    }
    if(20 <= thousands && thousands < 40) {
        taxRate = 7;
    }
    if(40 <= thousands && thousands < 78) {
        taxRate = 12;
    }
    if(thousands <= 78) {
        taxRate = 14;
    }
    
    //calculate income tax
    double tax = income * taxRate / 100;
    System.out.println("The tax rate on $"+thousands+",000 is "+taxRate+"% and the tax is $"+tax);
        
    } //end main method
} //end class