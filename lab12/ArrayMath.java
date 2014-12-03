//Matt Kawa
//December 3, 2014
//	CSE2
//	Lab 12
//	Array Math Program

//perfoms basic arithmetic operations on arrays of doubles

public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static boolean equals(double[] x, double[] y){
      if(x.length!=y.length){
          return false; //if lengths different
      }
      for(int i=0; i<x.length; i++){
          if(x[i]!=y[i]){
              return false; //if any values different
          }
      }
      return true;
  }
  
  public static double[] addArrays(double[] x, double[] y){
      double[] addedArrays = new double[findMaxLength(x,y)];
      
      for(int i=0; i<findMaxLength(x, y); i++){
          if(i<x.length && i<y.length){ //normal circumstances
            addedArrays[i] = x[i] + y[i]; //add values
          }
          if(i>=x.length){ //if x is too short
              addedArrays[i] += y[i]; //assume x[i] is 0
          }
          if(i>=y.length){ //if y is too short
              addedArrays[i] += x[i]; //assume y[i] is 0
          }
      }
      
      return addedArrays;
  }
  
  public static int findMaxLength(double[] x, double[] y){
      //find length of longer array
      if(x.length<y.length){
          return x.length;
      } else {
          return y.length;
      }
  }
}