/*
 * Author       : Prasad Satpute
 * Date         : 04/03/2022
 * Program      : Person and Teacher Class
 * Description  : 
 */
package com.assignment5;

public class TestClass {
    public static void main(String[] args) {
        cTeacher c = new cTeacher();
        c.showData();
        cTeacher c1 = new cTeacher("XYZ", 22, 102, "JEE", 70000);
        c.showData();
    }
}
