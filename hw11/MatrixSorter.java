//Matt Kawa
//December 3, 2014
//	CSE2
//	Homework 11
//	Matrix Sorter Program

//creates and performs operations on 3d arrays
public class MatrixSorter {
    public static void main(String[] args) {
        int mat3d[][][];
        mat3d = buildMat3d();
        show(mat3d, false);
        System.out.println("The smallest entry in the 3D matrix is " +
            findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d, true);
    }
    
    public static int[][] sort(int mat3d[][]){
        int min = 99;
        
        //sort columns within each row - selection sort
        for(int i=0;i<7;i++){
            for(int j=0; j<mat3d[i].length;j++){
                int index = j;
                for(int k=j+1; k<mat3d[i].length; k++){
                    //check for min for all values after index
                    if(mat3d[i][k] < mat3d[i][index]){
                        index = k;
                    }
                }
                
                //swap min with index element
                int temp = mat3d[i][j];
                mat3d[i][j] = mat3d[i][index];
                mat3d[i][index] = temp;
            }
        }
        
        //sort rows within matrix - insertion sort
        for(int i=0;i<mat3d.length-1;i++){
            for(int j = i+1;j<mat3d.length; j++){
                while(mat3d[i][0]>mat3d[j][0]){
                    int[] temp = mat3d[i];
                    mat3d[i] = mat3d[j];
                    mat3d[j] = temp;
                }
            }
        }
        
        return mat3d;
    }
    
    public static int findMin(int mat3d[][][]){
        int min = 99;//initialize min to max possible value
        for(int s=0;s<3;s++){
            for(int j=0;j<(3+2*s);j++){
                for(int k=0;k<(s+j+1);k++){
                    //if value is less than current min,
                    //make it new min
                    if(mat3d[s][j][k]<min){
                        min = mat3d[s][j][k];
                    }
                }
            }
        }
        
        return min;
    }
    
    public static void show(int mat3d[][][], boolean sorted){
        //print array
        for(int s=0;s<3;s++){
            //print slab header
            System.out.print("---------------------------Slab "+(1+s));
            if(sorted){
                if(s==2){
                    System.out.println(" sorted");
                }else{
                    System.out.println(" unsorted");
                }
            }else{
                System.out.println();
            }
            
            //print slab by rows
            for(int j=0;j<(3+2*s); j++){
                //print row by columns
                for(int k=0;k<(mat3d[s][j].length);k++){
                    System.out.print(mat3d[s][j][k]+" ");
                }
                System.out.println("\r");
            }
        }
    }
    
    public static int[][][] buildMat3d(){
        //create array
        int[][][] mat3d = new int[3][][];
        
        for(int s=0;s<3;s++){
            //fill slabs with 2d arrays
            mat3d[s] = new int[(3+2*s)][];
            
            for(int j=0; j<(3+2*s); j++){
                //fill 2d slabs with normal (1d) arrays
                mat3d[s][j] = new int[(s+j+1)];
            }
        }
        
        //initialize values randomly
        for(int s=0;s<3;s++){
            for(int j=0;j<(3+2*s);j++){
                for(int k=0;k<(s+j+1);k++){
                    mat3d[s][j][k] = (int)(100*(Math.random()));
                }
            }
        }
        
        return mat3d;
    }
}