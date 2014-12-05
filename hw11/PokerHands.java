//Matt Kawa
//November 18, 2014
//	CSE2
//	Homework 11
//	Poker Hands Program

//allows the user to enter a 5-card poker hand and tells its rank

import java.util.Scanner;
public class PokerHands{
    public static void main(String[] args){
        String input = "y";
        int[] hand = new int[5];
        String suit = "";
        String face = "";
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");
            input = scan.next();
            if(!(input.equals("y") || input.equals("Y"))){
                return;
            }
            
            for(int i=0; i<5; i++){
                //take input from user
                System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
                suit = scan.next();
                if(!(suit.equals("c") || suit.equals("d") || suit.equals("h") || suit.equals("s"))){
                    System.out.println("You did not enter a valid response");
                    i--;
                }else{ //if suit input valid
                    System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
                    face = scan.next();
                    if(!(face.equals("a") || face.equals("k") || face.equals("q") ||
                            face.equals("j") || face.equals("10") || face.equals("9") || 
                            face.equals("8") || face.equals("7") || face.equals("6") || 
                            face.equals("5") || face.equals("4") || face.equals("3") || 
                            face.equals("2"))){ //^valid face inputs
                        System.out.println("You did not enter a valid response");
                        i--;
                    }else{ //if both inputs valid
                        hand[i] = 0;
                        if(suit.equals("d")){ hand[i] += 13; }
                        if(suit.equals("h")){ hand[i] += 26; }
                        if(suit.equals("s")){ hand[i] += 39; }
                        
                        if(face.equals("a")){ hand[i] += 0; }
                        if(face.equals("k")){ hand[i] += 1; }
                        if(face.equals("q")){ hand[i] += 2; }
                        if(face.equals("j")){ hand[i] += 3; }
                        if(face.equals("10")){ hand[i] += 4; }
                        if(face.equals("9")){ hand[i] += 5; }
                        if(face.equals("8")){ hand[i] += 6; }
                        if(face.equals("7")){ hand[i] += 7; }
                        if(face.equals("6")){ hand[i] += 8; }
                        if(face.equals("5")){ hand[i] += 9; }
                        if(face.equals("4")){ hand[i] += 10; }
                        if(face.equals("3")){ hand[i] += 11; }
                        if(face.equals("2")){ hand[i] += 12; }
                        
                        //check if already entered
                        boolean alreadyEntered = false;
                        for(int j=0; j<i; j++){
                            if(hand[i]==hand[j]){
                                alreadyEntered = true;
                            }
                        }
                        if(alreadyEntered==true){
                            System.out.println("You already entered that card");
                            i--;
                        }
                    }
                }
            }
            
            showOneHand(hand);
            System.out.println("This is a "+determineHand(hand)+".");
            
        }while(input.equals("y") || input.equals("Y"));
    }
    
    public static String determineHand(int hand[]){
        
        //create/populate array showing frequency of different faces
        int[] frequency = new int[13];
        for(int i=0; i<5; i++){
            frequency[hand[i]%13]++;
        }
        
        //CHECK FOR STRAIGHT
        boolean straight = false;
        for(int i=0; i<9; i++){
            if(frequency[i]==1 && frequency[i+1]==1 && frequency[i+2]==1 && frequency[i+3]==1 && frequency[i+4]==1){
                straight = true;
            }
        }
        //if ace-low straight
        if(frequency[0]==1 && frequency[12]==1 && frequency[11]==1 && frequency[10]==1 && frequency[9]==1){
            straight = true;
        }
        
        //CHECK FOR FLUSH
        boolean flush = true;
        for(int i=0;i<4;i++){
            if(hand[i+1]/13!=hand[i]/13 || hand[0]/13!=hand[4]/13){
                flush = false;
            }
        }
        
        //COUNT # OF PAIRS
        int pairs = 0;
        for(int i=0; i<13; i++){
            if(frequency[i]==2){
                pairs+=1;
            }
        }
        
        //ROYAL FLUSH
        boolean ace, king, queen, jack, ten;
        ace = king = queen = jack = ten = false;
        for(int i=0; i<5; i++){
            if(hand[i]%13 == 0){ ace = true; }
            if(hand[i]%13 == 1){ king = true; }
            if(hand[i]%13 == 2){ queen = true; }
            if(hand[i]%13 == 3){ jack = true; }
            if(hand[i]%13 == 4){ ten = true; }
        }
        if(ace && king && queen && jack && ten && flush){
            return "Royal Flush!"; //if highest straight & all same suit
        }
        
        //STRAIGHT FLUSH
        if(straight && flush){ return "Straight Flush"; } //already checked straight & flush
        
        //FOUR OF A KIND
        for(int i=0; i<13; i++){
            if(frequency[i]==4){
                return "Four of a Kind"; //if any value comes up 4 times
            }
        }
        
        //FULL HOUSE
        boolean threeOfAKind = false;
        boolean pair = false;
        for(int i=0; i<13; i++){
            //check for 3-of-a-kind
            if(frequency[i]==3){
                threeOfAKind = true;
            }
            //check for pair
            if(frequency[i]==2){
                pair = true;
            }
        }
        if(threeOfAKind && pair){ return "Full House"; } //if 3 of one value and 2 of another
        
        //FLUSH
        if(flush){ return "Flush"; } //already tested flush
        
        //STRAIGHT
        if(straight){ return "Straight"; } //already tested straight
        
        //THREE OF A KIND
        if(threeOfAKind){ return "Three of a Kind"; } //if any value comes up exactly 3 times
        
        //TWO PAIR
        if(pairs==2){ return "Two Pair"; } //already counted pairs
        
        //PAIR
        if(pair){ return "Pair"; } //checked for single pair w/in full house
        
        //IF NOT ANY HIGHER VALUED HAND (DEFAULT CASE)
        return "High Card";
    }
    
    public static void showOneHand(int hand[]) {
        String suit[] = {
            "Clubs:    ", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        String face[] = {
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "
        };
        String out = "";
        for (int s = 0; s < 4; s++) {
            out += suit[s];
            for (int rank = 0; rank < 13; rank++)
                for (int card = 0; card < 5; card++)
                    if (hand[card] / 13 == s && hand[card] % 13 == rank)
                        out += face[rank];
            out += '\n';
        }
        System.out.println(out);
    }
}