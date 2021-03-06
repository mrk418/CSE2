//Matt Kawa
//November 4, 2014
//	CSE2
//	Homework 09
//	Blocked Again Program

//uses methods to create number stacks



import java.util.Scanner;
public class BlockedAgain{
    
    public static int getInt(int m) { //PROBLEM A
    	System.out.print("Enter an integer between 1 and 9, inclusive- "); //prompt user
    	do{
    		m = checkInt(m); //see if int
    	} while(m==0); //until m is changed

    	do{
        	m = checkRange(m); //see if [1,9]
    	} while(m<1 || m>9); //while it's outside of range
        return m;
    }
    
    public static int checkInt(int m) {// PROBLEM A1
    	//see if integer
        Scanner scan=new Scanner(System.in);
        if(scan.hasNextInt()){
    		m = scan.nextInt();
    		return m;
    	}else {
    		System.out.print("You did not enter an int; try again: ");
    	}
    	return m;
    }
    
    public static int checkRange(int m){ //PROBLEM A2
    	//check if int entered is between 1 and 9, inclusive
    	Scanner scan=new Scanner(System.in);
        if(m>=1 && m<=9){
            return m;
        } else {
            System.out.print("You did not enter an int in [1,9]; try again: ");
            if(scan.hasNextInt()){
            	m = scan.nextInt();
            }
            return m;
        }
    }
    
    public static void allBlocks(int m) {
		//FOR
		int n = 1;
		int i = 0;
		int j = 1;
		int k = 1;
		int x = 1;
		
		for(i=1;i<=m;i++){
			for(x=1;x<=i;x++){
				//spacing for rows of digits
				for(j=1;j<=m-i;j++){
					System.out.print(" ");
				}
				//rows of digits
				for(j=1;j<=k;j++){
					System.out.print(i);
				}
				System.out.println("");
			}
			
			//spacing for rows of dashes
			for(j=1;j<=m-i;j++){
				System.out.print(" ");
			}
			//rows of dashes
			for(j=1;j<=k;j++){
				System.out.print("-");
			}
			k+=2;
			System.out.println("");
		}
    }


    public static void main(String []s){
        int m = 0;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(m); 
        allBlocks(m);
    }
}

/*import java.util.Scanner;
public class HW9{
    public static void main(String[] arg){
	Scanner scan=new Scanner(System.in);
	
	//FOR
	int n = 1;
	int i = 0;
	int j = 1;
	int k = 1;
	int x = 1;
	System.out.print("Enter an integer between 1 and 9- ");
	if(scan.hasNextInt()){
		n = scan.nextInt();
	}else {
		System.out.println("You did not enter an int");
		return;
	}
	if(n<1 && n<10){
		System.out.println("You did not enter a number between 1 and 9");
		return;
	}
	
	System.out.println("Using FOR loops:");
	
	for(i=1;i<=n;i++){
		for(x=1;x<=i;x++){
			//spacing for rows of digits
			for(j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			//rows of digits
			for(j=1;j<=k;j++){
				System.out.print(i);
			}
			System.out.println("");
		}
		
		//spacing for rows of dashes
		for(j=1;j<=n-i;j++){
			System.out.print(" ");
		}
		//rows of dashes
		for(j=1;j<=k;j++){
			System.out.print("-");
		}
		k+=2;
		System.out.println("");
	}
	
	//RESET VARIABLES
	k=1;
	x=0;
	
	//WHILE
	System.out.println("Using WHILE loops:");
	i=1;
	while(i<=n){
		while(x<i){
			//spacing for digit rows
			j=1;
			while(j<=n-i){
				System.out.print(" ");
				j++;
			}
			//digit rows
			j=1;
			while(j<=k){
				System.out.print(i);
				j++;
			}
			System.out.println("");
			x++;
		}
		
		//spacing for dash rows
		j=1;
		while(j<=n-i){
			System.out.print(" ");
			j++;
		}
		//dash rows
		j=1;
		while(j<=k){
			System.out.print("-");
			j++;
		}
		System.out.println("");
		
		k+=2;
		i++;
		x=0;
	}
	
	//RESET VARIABLES
	k=1;
	x=0;
	
	//DO-WHILE
	System.out.println("Using DO-WHILE loops:");
	i=1;
	do{
		do{
			//spacing for digit rows
			j=1;
			do{
				System.out.print(" ");
				if(i==n){
					System.out.print("\b");
				}
				j++;
			}while(j<=n-i);
			//digit rows
			j=1;
			do{
				System.out.print(i);
				j++;
			}while(j<=k);
			System.out.println("");
			x++;
		}while(x<i);
		
		//spacing for dash rows
		j=1;
		do{
			System.out.print(" ");
			if(i==n){
				System.out.print("\b");
			}
			j++;
		}while(j<=n-i);
		//dash rows
		j=1;
		do{
			System.out.print("-");
			j++;
		}while(j<=k);
		System.out.println("");
		
		k+=2;
		i++;
		x=0;
	}while(i<=n);
	
    } //end main method
} //end class
*/