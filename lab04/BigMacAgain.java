//Matt Kawa
//September 19, 2014
//  CSE2
//  Lab 04
//  Big Mac Program--Again

//  calculates the cost of a fast food meal based on input from the user
//  using selection statements to validate input

import java.util.Scanner; //import scanner class

public class BigMacAgain { //define class
    public static void main(String[] args) { //define main method
        
        //declare/construct instance of scanner
        Scanner myScanner = new Scanner(System.in);
        
        final double cost$ = 2.22; //define constant for price
        
        //prompt user for input
        System.out.print("Enter the number of Big Macs: ");
        if(myScanner.hasNextInt()){  //check to see if user entered int...
            int nBigMacs = myScanner.nextInt(); //if so, store int
            
            if(nBigMacs>0){ //if acceptable input...
                double totalCost$ = cost$*nBigMacs; //calculate cost of big macs
                //round to 2 places
                totalCost$*=100;
                totalCost$ = (int)totalCost$;
                totalCost$ /= 100;
                
                System.out.println("You ordered "+nBigMacs+" Big Macs for a cost of "+nBigMacs+"x2.22 = $"+totalCost$);
                
                System.out.print("Do you want an order of fries (Y/y/N/n)? "); //prompt for fries
                String answer = myScanner.next(); //read user input
                if(answer.equals("Y") || answer.equals("y") || answer.equals("N") || answer.equals("n")) { //if acceptable input
                    
                    if(answer.equals("Y") || answer.equals("y")) { //if yes...
                        System.out.println("You ordered fries at a cost of $2.15"); //show cost of fries
                        totalCost$ += 2.15; //add cost of fries
                        System.out.println("The total cost of the meal is $"+totalCost$); //show new total
                    } else { //if no...
                        System.out.println("The total cost of the meal is $"+totalCost$); //show total without fries
                    }
                    
                } else { //if not Y/y/N/n...
                    System.out.println("You did not enter a proper answer"); //error report
                    return; //exit program
                }
                
            } else { //if int <= 0...
                System.out.println("You did not enter an int > 0"); //report user error
                return; //terminate program
            }
            
        } else { //if not int...
            System.out.println("You did not enter an int"); //if not, print error message
            return;  //leaves/terminates the program
        }
        
        
    }//end main method
}//end class