//Matt Kawa
//November 18, 2014
//	CSE2
//	Homework 10
//	Poker Odds Program

//generates random poker hands and simulates odds of different pairs coming up

import java.util.Random;
import java.util.Scanner;
public class PokerOdds {
    public static void main(String[] arg) {
        showHands();
        simulateOdds();
    }

    public static void showHands() {
        //declare/construct scanner
        Scanner scan = new Scanner(System.in);
        String answer = "";
        
        do{
            //build deck
            int deck[] = new int[52];
            for (int i = 0; i <= 51; i++) {
                deck[i] = i;
            }
    
            //build empty hand array
            int hand[] = new int[5];
            for (int i = 0; i < 5; i++) {
                hand[i] = -1;
            }
        
            //randomly assign cards to hand array
            for(int i = 0; i < 5; i++){
                int card = (int)((51-i) * Math.random());
                hand[i] = deck[card];
                deck[card] = -1;
                //move -1 to end of deck
                int temp = deck[51-i];
                deck[51-i] = -1;
                deck[card] = temp;
            }
        
            /*print hand
            for(int i=0; i<5; i++){
                System.out.println(hand[i]);
            }*/

            //prepare to print hand
            String cardOut = "0";
            String suits[] = {"   Clubs:\t", "Diamonds:\t", "  Hearts:\t", "  Spades:\t"};
            for(int i=0; i<4; i++){
                for(int j=0; j<5; j++){
                    if(hand[j]/13 == i){
                        switch(hand[j]%13){
                            case 0: cardOut = "A";
                                    break;
                            case 11: cardOut = "J";
                                    break;
                            case 12: cardOut = "Q";
                                    break;
                            case 13: cardOut = "K";
                                    break;
                            default: cardOut = ""+(hand[j]%13);
                                    break;
                        }
                        suits[i] += (" " + cardOut);
                        
                    }
                }
            }
            
            //print hand
            for(int i=0; i<4; i++){
                System.out.println(suits[i]);
            }
            
            //prompt to run again
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
        }while(answer.equals("Y") || answer.equals("y"));
    }
    
    public static void simulateOdds(){
        int nonPairs = 0;
        int pairs[] = new int[14];
        //initialize all pair counters to 0
        for(int i=0; i<=13; i++){
            pairs[i] = 0;
        }
        
        for(int q=0; q<10000; q++){
            //build deck
            int deck[] = new int[52];
            for (int i = 0; i <= 51; i++) {
                deck[i] = i;
            }
    
            //build empty hand array
            int hand[] = new int[5];
            for (int i = 0; i < 5; i++) {
                hand[i] = -1;
            }
        
            //randomly assign cards to hand array
            for(int i = 0; i < 5; i++){
                int card = (int)((51-i) * Math.random());
                hand[i] = deck[card];
                deck[card] = -1;
                //move -1 to end of deck
                int temp = deck[51-i];
                deck[51-i] = -1;
                deck[card] = temp;
            }
            
            //check to see if hand is a pair/act accordingly
            if(exactlyOneDup(hand)!=-1){
                pairs[exactlyOneDup(hand)] += 1;
            }else{
                nonPairs+=1;
            }
        }
        
        //print results
        System.out.println("rank\tfreq of exactly one pair");
        System.out.println(" A  \t\t"+pairs[0]);
        System.out.println(" K  \t\t"+pairs[13]);
        System.out.println(" Q  \t\t"+pairs[12]);
        System.out.println(" J  \t\t"+pairs[11]);
        for(int i=10; i>=1; i--){
            System.out.println(" "+i+"  \t\t"+pairs[i]);
        }
        System.out.println("Total not exactly one pair: "+nonPairs);
    }
    
    public static int exactlyOneDup(int hand[]){
        int numDups = 0;
        int matchedCard = -1;
        //check for duplicates
        for(int i = 0; i<hand.length; i++){
            for(int j = i+1; j<hand.length; j++){
                if(hand[j]%13==hand[i]%14){
                    numDups+=1;
                    matchedCard = hand[j]%14;
                    if(numDups>1){
                        return -1;
                    }
                }
            }
        }
        if(numDups==1){
            return matchedCard;
        } else {
            return -1;
        }
    }
}
