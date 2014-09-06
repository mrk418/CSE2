//Matt Kawa
//CSE2
//HW 02
//  Arithmetic Program
//  performs simple arithmetic operations to manipulate a set of variables

//define class
public class Arithmetic {

    //define main method
    public static void main(String[] args)  {
    
        //Assumptions (input variables)
        int nSocks=3;   //number of pairs of socks
        double sockCost$=2.58;  //cost per pair of socks ('$' is part of variable name)
        int nGlasses=6; //number of drinking glasses
        double glassCost$=2.29; //cost per glass
        int nEnvelopes=1;   //number of boxes of envelopes
        double envelopeCost$=3.25;  //cost per box of envelopes
        double taxPercent=.06;  //sales tax rate
        
        //output variables
        double totalSockCost$; //total cost of socks (pre-tax)
        double totalGlassCost$; //total cost of glasses (pre-tax)
        double totalEnvelopeCost$; //total cost of envelopes (pre-tax)
        double totalCost$; //total cost pre-tax of everything
        
        double taxSock$; //tax on socks
        double taxGlass$; //tax on glasses
        double taxEnvelope$; //tax on envelopes
        double taxTotal$; //total tax
        
        double finalSockCost$; //post-tax total cost of socks
        double finalGlassCost$; //post-tax total cost of glasses
        double finalEnvelopeCost$; //post-tax total cost of envelopes
        double finalCost$; //post-tax cost of all goods
        
        
        //PRE-TAX CALCULATIONS
        totalSockCost$=nSocks*sockCost$;
        totalGlassCost$=nGlasses*glassCost$;
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        
        totalCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
            //round to 2 decimal places
            totalCost$=totalCost$*100; //multiply by 100
            double roundTotalCost$ = (int)totalCost$; //declare new variable and set to integer portion of total cost (*100)
            roundTotalCost$=roundTotalCost$/100; //divide by 100
        
        //TAX CALCULATIONS
        
        //calculate tax on socks
        taxSock$=totalSockCost$*taxPercent;
            //round to 2 decimal places
            taxSock$=taxSock$*100; //multiply by 100
            double roundTaxSock$=(int)taxSock$; //declare new variable = truncated result from above
            roundTaxSock$=roundTaxSock$/100; //divide by 100
        
        //calculate tax on glasses
        taxGlass$=totalGlassCost$*taxPercent;
            //round to 2 decimal places
            taxGlass$=taxGlass$*100; //multiply by 100
            double roundTaxGlass$=(int)taxGlass$; //declare new variable = truncated result from above
            roundTaxGlass$=roundTaxGlass$/100; //divide by 100
        
        //calculate tax on envelopes
        taxEnvelope$=totalEnvelopeCost$*taxPercent;
            //round to 2 decimal places
            taxEnvelope$=taxEnvelope$*100; //multiply by 100
            double roundTaxEnvelope$=(int)taxEnvelope$; //declare new variable = truncated result from above
            roundTaxEnvelope$=roundTaxEnvelope$/100; //divide by 100
        
        taxTotal$=roundTaxSock$+roundTaxGlass$+roundTaxEnvelope$;
            //round to 2 decimal places
            taxTotal$=taxTotal$*100; //multiply by 100
            double roundTaxTotal$=(int)taxTotal$; //declare new variable = truncated result from above
            roundTaxTotal$=roundTaxTotal$ / 100; //divide by 100
        
        //POST-TAX CALCULATIONS
        //calculate final cost of socks
        finalSockCost$=totalSockCost$+roundTaxSock$;
            //round to 2 decimal places
            finalSockCost$=finalSockCost$*100; //multiply by 100
            double roundSockCost$=(int)finalSockCost$; //declare new variable = truncated result from above
            roundSockCost$=roundSockCost$/100; //divide by 100
        
        //calculate final cost of glasses
        finalGlassCost$=totalGlassCost$+roundTaxGlass$;
        
        //calculate final cost of envelopes
        finalEnvelopeCost$=totalEnvelopeCost$+roundTaxEnvelope$;
        
        //calculate total final cost
        finalCost$=roundSockCost$+finalGlassCost$+finalEnvelopeCost$;
        
        //print results
        System.out.println("ITEM: PAIRS OF SOCKS");
        System.out.println("Number purchased: "+nSocks);
        System.out.println("Cost per unit: $"+sockCost$);
        System.out.println("Pre-tax cost: $"+totalSockCost$);
        System.out.println("Sales tax: $"+roundTaxSock$);
        System.out.println("Final cost: $"+roundSockCost$);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println("ITEM: DRINKING GLASSES");
        System.out.println("Number purchased: "+nGlasses);
        System.out.println("Cost per unit: $"+glassCost$);
        System.out.println("Pre-tax cost: $"+totalGlassCost$);
        System.out.println("Sales tax: $"+roundTaxGlass$);
        System.out.println("Final cost: $"+finalGlassCost$);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println("ITEM: BOXES OF ENVELOPES");
        System.out.println("Number purchased: "+nEnvelopes);
        System.out.println("Cost per unit: $"+envelopeCost$);
        System.out.println("Pre-tax cost: $"+totalEnvelopeCost$);
        System.out.println("Sales tax: $"+roundTaxEnvelope$);
        System.out.println("Final cost: $"+finalEnvelopeCost$);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println("TOTAL COST (PRE-TAX): $"+roundTotalCost$);
        System.out.println("TOTAL SALES TAX: $"+roundTaxTotal$);
        System.out.println("TOTAL COST (POST-TAX): $"+finalCost$);
    
    }   //end main method

}   //end class