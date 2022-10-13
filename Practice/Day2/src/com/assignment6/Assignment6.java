/*
 * Author       : Prasad Satpute
 * Date         : 04/03/2022
 * Program      : Get Rate of Interest
 * Description  : 
 */
package com.assignment6;

class Bank{  
    int getRateOfInterest()
    {
        return 0;
    }  
}

class SBI extends Bank{  
    @Override
    int getRateOfInterest()
    {
        return 8;
    }  
}  
  
class ICICI extends Bank{  
    @Override
    int getRateOfInterest()
    {
        return 7;
    }  
}  
class AXIS extends Bank{  
    @Override
    int getRateOfInterest()
    {
        return 9;
    }  
}  

public class Assignment6 {
    public static void main(String args[]){  
    SBI s=new SBI();  
    ICICI i=new ICICI();  
    AXIS a=new AXIS();  
    System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
    System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
    System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
    }
}
