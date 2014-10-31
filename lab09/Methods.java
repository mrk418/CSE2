//Matt Kawa
//October 24, 2014
//	CSE2
//	Lab 09
//	Methods Program

//uses methods to sort numbers by value

import java.util.Scanner;
public class Methods {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three ints");
        a = getInt(scan);
        b = getInt(scan);
        c = getInt(scan);
        System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));
        System.out.println("The larger of " + a + ", " + b + ", and " + c + " is " + larger(a, larger(b, c)));
        System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b + ", and " + c + " are in ascending order");
    }
    
    public static boolean ascending(int a, int b, int c){
        if(a<b && b<c){
            return true;
        } else {
            return false;
        }
    }
    
    public static int larger(int a, int b){
        int greaterInt = 0;
        if (a > b){
            greaterInt = a;
        }
        if (b > a){
            greaterInt = b;
        }
        return greaterInt;
    }
    
    public static int getInt(Scanner scan){
            System.out.print("Enter an int- ");
            if(scan.hasNextInt()){
                return scan.nextInt();
            } else {
                System.out.println("You did not enter an int; try again");
                System.exit(0);
                return 0;
            }
    }
}