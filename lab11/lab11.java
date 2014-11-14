//Matt Kawa
//November 11, 2014
//	CSE2
//	Lab 11
//	Basic Functions of Arrays

//performs a few basic computations on a user-input array

import java.util.Scanner;
public class lab11{
    public static void main(String []  arg){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 10 ints - ");
        
        //declare array/other variables
        int[] inputArray = new int[10];
        int lowestInt = 0;  // FIX //
        int highestInt = 0; //THESE// maybe?
        int sum = 0;
        
        //add ints to array and perform computations
        for(int i = 0; i < 10; i++){
            if(i==0){
                lowestInt = inputArray[i];
                highestInt = inputArray[i];
            }
            inputArray[i] = scan.nextInt();
            sum += inputArray[i];
            if(inputArray[i]<lowestInt){
                lowestInt = inputArray[i];
            }
            if(inputArray[i]>highestInt){
                highestInt = inputArray[i];
            }
        }
        
        //reverse array into new array
        int[] reversedArray = new int[10];
        for(int i = 0; i<10; i++){
            reversedArray[i] = inputArray[9-i];
        }
        
        System.out.println("The lowest entry is "+lowestInt);
        System.out.println("The highest entry is "+highestInt);
        System.out.println("The sum is "+sum);
        
        //print arrays in columns
        for(int i = 0; i<10; i++){
            System.out.println(inputArray[i] + "\t" + reversedArray[i]);
        }
    }
}