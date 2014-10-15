//Matt Kawa
//October 14, 2014
//  CSE2
//  Homework 06
//  Roulette Program

//  runs a simulation of a particular roulette gambling strategy many times
//  and presents the results

public class Roulette {
    public static void main(String args[]) {
        
        //declare variables
        int initial$ = 100;
        int tempWinnings$ = 0;
        int winnings$ = 0;
        int roundsProfited = 0;
        int roundsLostEverything = 0;
        int spinResult = 0;
        int chosenNumber = 0;
        
        for (int i=0; i<1000; i++) { //run entire simulation 1000x
            chosenNumber = (int)(38*Math.random()); //set number on which to place bet
            for(initial$ = 100; initial$>0; initial$--) {
                spinResult = (int)(38*Math.random()); //spin wheel
                if (spinResult == chosenNumber) { //if win
                    tempWinnings$ += 36; //add money won
                }
            } //end simulation
            
            if (tempWinnings$ == 0) { //if no wins
                roundsLostEverything += 1;
            }
            if (tempWinnings$ > 100) { //if profit
                roundsProfited += 1;
                winnings$ += tempWinnings$;
            }
            tempWinnings$ = 0;
        } //end container loop
        
        //print results
        System.out.println("You profited a total of _"+roundsProfited+"_ times (out of 1000).");
        System.out.println("You lost all of your money (didn't win a single spin) _"+roundsLostEverything+"_ times (out of 1000).");
        System.out.println("You won a total of _$"+winnings$+"_ in 100000 simulated spins");
        System.out.println("Your net losses were _$"+(100000 - winnings$)+"_ in 100000 simulated spins");
        
    }//end main method
}//end class