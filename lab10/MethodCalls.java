//Matt Kawa
//October 31, 2014
//	CSE2
//	Lab 10
//	Method Calling Program

//uses methods to call other methods to "concatenate" numbers

public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    
    public static int addDigit(int number,int digit){
        //handle negative numbers
        boolean isNegative = false;
        if(number*digit<0){
            isNegative = true;
        }
        //make all parameters positive
        number = (int)Math.abs(number);
        digit = (int)Math.abs(digit);
        
        //find length of number
        String temp = "";
        temp += number;
        int numLength = temp.length();
        
        //multiply digit by appropriate power of 10, based on length of number
        for(int i=0;i<numLength;i++){
            digit*=10;
        }
        
        //"concatenate" numbers
        number += digit;
        
        //return to negative if necessary
        if(isNegative){
            number*=-1;
        }
        
        return number;
    }
    
    public static int join(int num1,int num2){
        //handle negatives (though not necessary for the given inputs)
        boolean isNegative = false;
        if(num1*num2<0){
            isNegative = true;
        }
        num1 = (int)Math.abs(num1);
        num2 = (int)Math.abs(num2);
        
        //find length of num1
        String temp = "";
        temp += num1;
        int num1Length = temp.length();
        
        //find length of num2
        String temp2 = "";
        temp2 += num2;
        int num2Length = temp2.length();
        
        //"concatenate" numbers
        for(int i=0;i<num1Length;i++){
            num2 += (num1%10)*power10(num2Length);
            num2Length+=1;
            num1 = (num1-num1%10)/10;
        }
        
        return num2;
    }
    
    public static int power10(int exponent){
        int result = 1;
        for(int i=0;i<exponent;i++){
            result*=10;
        }
        return result;
    }
}  
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
