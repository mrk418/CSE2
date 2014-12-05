public class temp{
    public static void main(String[] args){
        int[][] array = new int[5][];
        for(int i=0;i<array.length;i++){
            array[i] = new int[2*i+1];
        }
        
        for(int i = 0;i<array.length;i++){
            for(int j=0;j<array[i].length; j++){
                array[i][j] = (int)(10*Math.random());
            }
        }
        printArray(array);
        
        System.out.println();
        
        for(int i=0;i<array.length-1;i++){
            for(int j = i+1;j<array.length; j++){
                while(array[i][0]>array[j][0]){
                    int[] temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        printArray(array);
        
    }
    
    public static void printArray(int[][] array){
        for(int i = 0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}