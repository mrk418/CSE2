/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    double x=0;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    Scanner myScanner = new Scanner(System.in);
    
    if(myScanner.hasNextDouble()){
        x=myScanner.nextDouble();
    } else {
        System.out.println("You did not enter a number");
        return;
    }
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   double result;
   if(x>=0 && x<=99){
       result = (100-x)/100;
       System.out.println("The proportion remaining is "+result);
   } else {
       System.out.println("You did not enter a number between 0 and 99");
   }
  }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *  Only accepts 5 different inputs, each laid out by an explicit if statement.
 *  I changed the code to accept all inputs from 0-99, 
 *  and not on a case-by-case basis.
 *  I also made it reject inputs that are not numbers between 0 and 99.
 * 
 */