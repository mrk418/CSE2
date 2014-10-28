//Matt Kawa
//October 27, 2014
//	CSE2
//	Homework 08
//	Driver Program

//uses method overloading to force the user to enter a certain type of input for similar methods

import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
    char input;
    Scanner scan=new Scanner(System.in);
    
    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
    input=getInput(scan,"Cc");
    System.out.println("You entered '"+input+"'");
    
    System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
    input=getInput(scan,"yYnN",5); //give up after 5 attempts
    if(input!=' '){
       System.out.println("You entered '"+input+"'");
    }
    
    input=getInput(scan,"Choose a digit.","0123456789");
    System.out.println("You entered '"+input+"'");
  }
  
  
  public static char getInput(Scanner scan, String prompt, String checkString) {//THIRD METHOD
    //declare/initialize variables
    String inputString = "";
    boolean match = false;
    char input = ' ';
    
    do{
      //construct prompt statement from checkString
      String prompt2 = "Enter one of: '";
      for(int i=0;i<checkString.length();i++){
        prompt2 += checkString.charAt(i); //append digit
        if(i!=checkString.length()-1){
          prompt2 += "', '"; //append stuff between digits
        }
      }
      prompt2 += "'- ";
      System.out.println(prompt2);
      
      inputString = scan.next(); //take input (string, any length)
      
      //make sure user entered a single char
      if(inputString.length()!=1){
        System.out.println("Enter exactly one character");
        System.out.println(prompt);
      }
      
      //convert input to char--essentially
      input = inputString.charAt(0);
      
      //check input against checkString
      for(int j=0;j<checkString.length();j++){
        if(input==checkString.charAt(j)){
          match = true;
        }
      }
      
      //handle user input appropriately
      if(inputString.length()==1){
        if(match){
          return input;
        } else {
          System.out.println("You did not enter an acceptable character");
          System.out.println(prompt);
        }
      }
    } while(inputString.length()!=1 || match == false);
  return ' ';
  }
  
  
  public static char getInput(Scanner scan,String checkString,int sentinel){//SECOND METHOD
    //declare/initialize variables
    String inputString = "";
    boolean match = false;
    char input = ' ';
    int failures = 0;
    
    do{
      inputString = scan.next(); //take input (string, any length)
      
      //make sure user entered a single char
      if(inputString.length()!=1){
        System.out.print("You should enter exactly one character- ");
        
        //count failed attempts and break at limit
        failures++;
        if(failures == sentinel){
          return ' ';
        }
      }
      
      //convert input to char--essentially
      input = inputString.charAt(0);
      
      //check input against checkString
      for(int j=0;j<checkString.length();j++){
        if(input==checkString.charAt(j)){
          match = true;
        }
      }
      
      //handle user input appropriately
      if(inputString.length()==1){
        if(match){
          return input;
        } else {
          System.out.print("You did not enter a character from the list 'Cc'; try again- ");
          
          //count failed attempts and break at limit
          failures++;
          if(failures == sentinel){
            return ' ';
          }
        }
      }
    } while(inputString.length()!=1 || match == false);
  return ' ';
  }
  
  
  public static char getInput(Scanner scan,String checkString){ //FIRST METHOD
    //declare/initialize variables
    String inputString = "";
    boolean match = false;
    char input;
    
    do{
      inputString = scan.next(); //take input of any length--hopefully 1, but OK otherwise for now
      
      //make sure length = 1 (user entered a char, not a string)
      if(inputString.length() != 1){
        System.out.print("You should enter exactly one character- ");
      }
      
      //set input char equal to input string['s first char]
      input = inputString.charAt(0);
      
      //check input against each char in the string of acceptable chars
      for(int i=0;i<checkString.length();i++){
        if(input == checkString.charAt(i)){
          match = true;
        }
      }
      
      //handle user input appropriately
      if(inputString.length()==1){
        if(match){
          return input;
        } else {
          System.out.print("You did not enter a character from the list 'Cc'; try again- ");
        }
      }
    } while(inputString.length() != 1 || match == false); //run as long as user input is incorrect
    
    return input;
  }
}