//Matt Kawa
//October 10, 2014
//  CSE2
//  Lab 07
//  Loop the Loop Program

//  prints stars on lines

import java.util.Scanner; //import scanner class

public class LoopTheLoop{
    public static void main(String[] args){
        
        //declare variables
        int nStars = 10;
        int i=1, j=1, k=1, x=1, y=1, z=1; //loop counters
        int userStars = 0;
        
        //PART 1
        //  print nStars stars on a line
        while(i<=nStars){
            if(i==nStars){
                System.out.println("*");
            } else {
                System.out.print("*");
            }
            i++;
        }
        
        //PART 2
        //  print an increasing number of stars on each line
        while(k<=nStars){
            //print a line with i stars in it
            for(j=1; j<=k; j++){
                System.out.print("*");
            }
            k++;
            System.out.println("");
        }
        
        //PART 3
        //  print allow user to set nStars
        Scanner myScanner = new Scanner(System.in); //declare/construct instance of scanner
        System.out.print("Enter an int between 1 and 15: ");
        
        //check if int
        if(myScanner.hasNextInt()){
            userStars = myScanner.nextInt();
        } else {
            System.out.println("You did not enter an int");
            return;
        }
        
        //check if int is in range
        if(userStars>=1 && userStars<=15){ //IF VALID INPUT, RUN PROGRAM...
            //  print userStars stars on a line
            while(z<=userStars){
                if(z==userStars){
                    System.out.println("*");
                } else {
                    System.out.print("*");
                }
                z++;
            }
            
            //print lines with increasing number of stars on them
            while(x<=userStars){
            //print a line with y stars in it
                for(y=1; y<=x; y++){
                    System.out.print("*");
                }
                x++;
                System.out.println("");
            }
        } else {
            System.out.println("Your int was not in the range 1-15");
        }
        
    }//end main method
}//end class