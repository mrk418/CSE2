//Matt Kawa
//September 4, 2014
//  CSE2
//  Lab 02
//  Cyclometer program

//  prints various data about a given bicycle ride

//  define class for the program
public class Cyclometer {
    //  add main method
    public static void main (String[] args) {
        //  input data
        int secsTrip1=480; //duration of first trip in seconds
        int secsTrip2=3220; //duration of second trip in seconds
        int countsTrip1=1561; //length of first trip in tire rotations ("counts")
        int countsTrip2=9037; //length of second trip in tire rotations ("counts")
        
        //  variables for useful constants,
        //  various distances, intermediate variables, and output data
        double wheelDiameter=27.0, //constant for diameter of wheel
        PI=3.14159, //define constant for Pi
        feetPerMile=5280, //constant for conversion between feet and miles
        inchesPerFoot=12, //constant for conversion between inches and feet
        secondsPerMinute=60; //constant for conversion between seconds and minutes
        double distanceTrip1, distanceTrip2, totalDistance; //declare variables for final outputs
        
        //  print numbers stored in variables for number of seconds and counts for each trip
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
            
        //  run the calculations; store the values
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //  Above gives distance in inches
        //  for each count, the bike travels a distance of
        //  the diameter times PI (in inches)
        distanceTrip1/=inchesPerFoot*feetPerMile; //converts distance to miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //calculates distance in miles
        totalDistance=distanceTrip1+distanceTrip2; //adds distances from both trips
        
        //Print output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }   //end main method
} //end class