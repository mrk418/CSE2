/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    //System.out.println("At line #11, n  = "+n+"; and k  = "+k);
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    //System.out.println("At line #21, n  = "+n+"; and k  = "+k);
    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    //System.out.println("At line #26, n  = "+n+"; and k  = "+k);
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    //System.out.println("At line #35, n  = "+n+"; and k  = "+k); *n=45 and k=53
    switch(n+k){ //n+k = 98
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98: //active case
        n/=5; 
        k/=9; //k becomes 5 here
        break; //INSERTED BREAK TO PREVENT K FROM BECOMING 0 IN DEFAULT CASE
      default:
        n-=3;
        k-=5; //without break after case 98, k becomes 0
    }
    //System.out.println("At line #52, n  = "+n+"; and k  = "+k); **k = 0 by this point, thus causing /0 error
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:
 * In the final switch statement, case 98 is activated, upon which k is set to 5.
 * Since there is no break after case 98, default is then activated, making k = 0.
 * The next line of code attempts to divide by k, causing a /0 runtime error.
 * Inserting a break at the end of case 98 solved the error.
 */
