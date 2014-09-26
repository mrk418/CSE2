//Matt Kawa
//September 26, 2014
//  CSE2
//  Lab 05
//  Random Games Program

//  plays various random number-based games with the user based on input

import java.util.Scanner; //import scanner class

public class RandomGames { //define class
    public static void main(String[] args) { //define main method
        
        //declare/construct instance of scanner
        Scanner myScanner = new Scanner(System.in);
        
        
        //ask user for game to play
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        
        //declare variables
        int rouletteNumber;
        String game = myScanner.nextLine();
        
        //handle user input appropriately
        switch (game) {
            //roulette
            case "R":
            case "r":
                rouletteNumber = (int)(Math.random() * 38); //generate random number
                switch(rouletteNumber) {
                    case 0: System.out.println(rouletteNumber+" - Blue"); //for 0
                    case 37: System.out.println("00 - Blue"); //for 00
                    default: System.out.print("Roulette: "+rouletteNumber); //for all other numbers
                        if(rouletteNumber % 2 == 0) { //if even
                            System.out.println(" - Black");
                        } else { //if odd
                            System.out.println(" - Red");
                        }
                }
                break;
            
            //pick a card
            case "P": 
            case "p": 
                System.out.println("Picking a card not implemented yet");
                break;
                
            //craps
            case "C": 
            case "c": 
                System.out.println("Craps option is yet to be implemented");
                break;
            
            //if invalid input
            default: System.out.println("'"+game+"' is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
        }
        
    }//end main method
}//end class