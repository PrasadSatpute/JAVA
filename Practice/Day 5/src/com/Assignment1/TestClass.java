/*
 * Author       : Prasad Satpute
 * Date         : 09/03/2022
 * Program      : Simple Calculator Using Generic Method
 * Description  : 
 */
package com.Assignment1;

import static com.Assignment1.GenericCalculator.menuOption;
import static com.Assignment1.GenericCalculator.sc;

public class TestClass {
    public static void main(String[] args) {
        
        int choice=0;
        GenericCalculator g=new GenericCalculator();
        
        while((choice = menuOption()) != 5){
        System.out.println("enter two number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Addition = "+g.add(n1, n2));
                break;
            case 2:
                System.out.println("substarction = "+g.sub(n1, n2));
                break;
            case 3:
                System.out.println("multiplication = "+g.multiplication(n1, n2));
                break;
            case 4:
                System.out.println("quotient = "+g.division(n1, n2));
                break;
            case 5 :
                return ;
            default :
                System.out.println("default");
                }
            
            }
    }
}
