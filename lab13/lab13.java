//Matt Kawa
//December 5, 2014
//	CSE2
//	Lab 13
//	Ragged Arrays Program

//creates a random, ragged, 2d array and sorts it

import java.util.Arrays;

public class lab13{
    public static void main(String[] args){
        //create array with 5 rows
        int[][] array = new int [5][];
        
        //fill rows with appropriate number of columns
        for(int i=0; i<5; i++){
            array[i] = new int[i*3+5];
        }
        
        //initialize to random values
        for(int i=0;i<5;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j] = (int)(40*Math.random());
            }
        }
        
        //display unsorted array
        System.out.println("This is the array before sorting");
        for(int j=0;j<5; j++){
            for(int k=0;k<(j*3+5);k++){
                System.out.print(array[j][k]+" ");
            }
        System.out.println("\r");
        }
        
        //sort array
        for(int i=0;i<5;i++){
            Arrays.sort(array[i]);
        }
        
        //display sorted array
        System.out.println("\nThis is the array after sorting");
        for(int j=0;j<5; j++){
            for(int k=0;k<(j*3+5);k++){
                System.out.print(array[j][k]+" ");
            }
        System.out.println("\r");
        }
    }
}