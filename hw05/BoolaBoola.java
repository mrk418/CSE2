//Matt Kawa
//September 27, 2014
//  CSE2
//  Homework 05
//  Boola Boola Program

//  quizzes the user on various random combination of logical tests involving boolean variables

import java.util.Scanner; //import scanner class

public class BoolaBoola { //define class
    public static void main(String[] args) { //define main method
        
        //declare/construct instance of scanner
        Scanner myScanner = new Scanner(System.in);
        
        //declare varibles
        int randomNumber = 0;
        boolean var1 = true;
        boolean var2 = true;
        boolean var3 = true;
        int operator = 0;
        boolean op1 = true;
        boolean op2 = true;
        String userInput = "";
        boolean booleanInput = true;
        boolean correctAnswer = true;
        
        //randomly assign boolean values
        randomNumber = (int)(Math.random()*8);
        switch(randomNumber) {
            case 0: var1 = false; var2 = false; var3 = false; break;
            case 1: var1 = false; var2 = false; var3 = true; break;
            case 2: var1 = false; var2 = true; var3 = false; break;
            case 3: var1 = false; var2 = true; var3 = true; break;
            case 4: var1 = true; var2 = false; var3 = false; break;
            case 5: var1 = true; var2 = false; var3 = true; break;
            case 6: var1 = true; var2 = true; var3 = false; break;
            case 7: var1 = true; var2 = true; var3 = true; break;
        }
        
        //randomly assign 2 operators
        operator = (int)(4*Math.random());
        switch(operator) {
            case 0: op1 = false; op2 = false;
                    System.out.print("Does "+var1+" || "+var2+" || "+var3+" have the value true(t/T) or false(f/F)? "); //ask user
                    userInput = myScanner.nextLine(); //store input
                    correctAnswer = var1 || var2 || var3; //calculate correct anser
                    break;
            case 1: op1 = false; op2 = true;
                System.out.print("Does "+var1+" || "+var2+" && "+var3+" have the value true(t/T) or false(f/F)? "); //ask user
                    userInput = myScanner.nextLine(); //store input
                    correctAnswer = var1 || var2 && var3; //calculate correct anser
                    /*if ( (correctAnswer == true && (userInput == "t" || userInput == "T")) || //if true AND user said true
                            (correctAnswer == false && (userInput == "f" || userInput == "F")) ) { //OR if false AND user said false
                                System.out.println("Correct"); //user is correct
                    } else {
                        System.out.println("Wrong; try again"); //else wrong
                    }*/
                    break;
            case 2: op1 = true; op2 = false;
                System.out.print("Does "+var1+" && "+var2+" || "+var3+" have the value true(t/T) or false(f/F)? "); //ask user
                userInput = myScanner.nextLine(); //store input
                correctAnswer = var1 && var2 || var3; //calculate correct anser
                    /*if ( (correctAnswer == true && (userInput == "t" || userInput == "T")) || //if true AND user said true
                            (correctAnswer == false && (userInput == "f" || userInput == "F")) ) { //OR if false AND user said false
                                System.out.println("Correct"); //user is correct
                    } else {
                        System.out.println("Wrong; try again"); //else wrong
                    }*/
                    break;
            case 3: op1 = true; op2 = true;
                System.out.print("Does "+var1+" && "+var2+" && "+var3+" have the value true(t/T) or false(f/F)? "); //ask user
                userInput = myScanner.nextLine(); //store input
                correctAnswer = var1 && var2 && var3; //calculate correct anser
                    /*if ( (correctAnswer == true && (userInput == "t" || userInput == "T")) || //if true AND user said true
                            (correctAnswer == false && (userInput == "f" || userInput == "F")) ) { //OR if false AND user said false
                                System.out.println("Correct"); //user is correct
                    } else {
                        System.out.println("Wrong; try again"); //else wrong
                    }*/
                    break;
        }
        
        if (correctAnswer == true) {
            if ( userInput.equals("t") || userInput.equals("T") ) {
                System.out.println("Correct");
            } else {
                System.out.println("Wrong; try again");
            }
        }
        if (correctAnswer == false) {
            if ( userInput.equals("f") || userInput.equals("F") ) {
                System.out.println("Correct");
            } else {
                System.out.println("Wrong; try again");
            }
        }
        //System.out.println("userInput, correct answer: "+userInput+", "+correctAnswer);
        //System.out.println(randomNumber+" "+var1+" "+var2+" "+var3);
    
    }//end main method
}//end class