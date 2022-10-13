/*
 * Author       : Prasad Satpute
 * Date         : 04/03/2022
 * Program      : Password Check
 * Description  : 
 */
package com.assignment7;

import java.util.Scanner;

class cAuthentication{
    String password;
    String confirmPassword;

    public cAuthentication(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
        checkPSWD(password, confirmPassword);
    }
    
    public void checkPSWD(String pswd, String cnfmPswd){
        if(password.equals(cnfmPswd))
        {
            System.out.println("Password is Same");
        }
        else
        {
            System.err.println("Password does not Match ");
        }
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password    :   ");
        String pswd1 = sc.nextLine();
        System.out.println("Confirm Password    :   ");
        String pswd2 = sc.nextLine();
        cAuthentication cA = new cAuthentication(pswd1, pswd2);
    }
}
