//Matt Kawa
//November 18, 2014
//	CSE2
//	Homework 10
//	Find Duplicates Program

//searches arrays for duplicate entries

import java.util.Scanner;
public class FindDuplicates {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        String answer = "";
        do {
            //prompt user for input
            System.out.print("Enter 10 ints- ");
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt();
            }
            //build output string based on results of boolean methods
            String out = "The array ";
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) {
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "duplicates.";
            System.out.println(out);
            out = "The array ";
            out += listArray(num);
            if (exactlyOneDup(num)) {
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }
    
    public static boolean hasDups(int num[]){ //check for duplicates (any quantity)
        int numDups = 0;
        for(int i = 0; i<num.length; i++){ //take every value
            for(int j = i+1; j<num.length; j++){ //...and compare to every subsequent value
                if(num[j]==num[i] && j!=i){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean exactlyOneDup(int num[]){ //check for exactly 1 duplicate
        int numDups = 0;
        for(int i = 0; i<num.length; i++){ //take every value
            for(int j = i+1; j<num.length; j++){ //...and compare to every subsequent value
                if(num[j]==num[i] && j!=i){
                    numDups+=1;
                    if(numDups>1){
                        return false;
                    }
                }
            }
        }
        if(numDups==1){
            return true;
        } else {
            return false;
        }
    }

    public static String listArray(int num[]) { //construct string to display array
        String out = "{";
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    }
}
