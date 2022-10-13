/*
 * Author       : Prasad Satpute
 * Date         : 08/03/2022
 * Program      : Find the Area of Sahpes using interface
 * Description  : 
 */
package com.Assignment1;

public class TestArea {
    public static void main(String[] args) {
        cRectangle obj1 = new cRectangle();
        obj1.inputData();
        obj1.showData();
        cCircle obj2 = new cCircle();
        obj2.inputData();
        obj2.showData();
        cTriangle obj3 = new cTriangle();
        obj3.inputData();
        obj3.showData();
    }
}
