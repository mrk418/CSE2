//Matt Kawa
//September 27, 2014
//  CSE2
//  Homework 05
//  Burger King Program

//  presents the user with various options for a meal at burger king
//  and returns their specific order

import java.util.Scanner; //import scanner class

public class BurgerKing { //define class
    public static void main(String[] args) { //define main method
        
        //declare/construct instance of scanner
        Scanner myScanner = new Scanner(System.in);
        
        //present user with options
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("\t Burger (B or b)");
        System.out.println("\t Soda (S or s)");
        System.out.print("\t Fries (F or f)- ");
        
        //declare variables/take user input
        String fixins = "";
        String soda = "";
        String size = "";
        String choice = myScanner.nextLine();
        
        //handle user choice appropriately
        switch(choice) {
            case "B":
            case "b":
                //if burger, prompt for fixins
                System.out.println("Enter A or a for \"all the fixins\"");
                System.out.println("\t Enter C or c for cheese");
                System.out.print("\t N or n for none of the above- ");
                
                //store input
                fixins = myScanner.nextLine();
                
                //handle choice of fixins
                switch(fixins) {
                    case "A":
                    case "a":
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                    case "C":
                    case "c":
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "N":
                    case "n":
                        System.out.println("You ordered a plain burger");
                        break;
                    default:
                        System.out.println("You did not enter any of A, a, C, c, N, or n");
                        break;
                }
                break;
            case "S":
            case "s":
                //if soda, prompt for type
                System.out.println("Do you want Pepsi (p or P),");
                System.out.print("\t Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)- ");
                
                //store input
                soda = myScanner.nextLine();
                
                //handle choice of soda
                switch(soda) {
                    case "P":
                    case "p":
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "C":
                    case "c":
                        System.out.println("You ordered a Coke");
                        break;
                    case "S":
                    case "s":
                        System.out.println("You ordered a Sprite");
                        break;
                    case "M":
                    case "m":
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    default:
                        System.out.println("You did not enter any of P, p, C, c, S, s, M, or m");
                        break;
                }
                break;
            case "F":
            case "f":
                System.out.print("Do you want a large or small order of fries (l,L,s, or S)- ");
                
                //store input
                size = myScanner.nextLine();
                
                //handle choice of size
                switch(size) {
                    case "L":
                    case "l":
                        System.out.println("You ordered large fries");
                        break;
                    case "S":
                    case "s":
                        System.out.println("You ordered small fries");
                        break;
                    default:
                        System.out.println("You did not enter any of L, l, S, s");
                        break;
                }
                break;
            default:
                System.out.println("You did not enter any of B, b, S, s, F, or f");
                break;
        }
        
        
    }//end main method
}//end class
