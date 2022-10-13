/*
 * Author       : Prasad Satpute
 * Date         : 08/03/2022
 * Program      : Class level scope and Method level scope
 * Description  : 
 */
package com.example;


class Car {
    public String color;
    private int speed;

    public Car(String color, int speed) {
        // Variables color and speed accessible here
    }

    public void drive(boolean fourWheel) {
        String tires = "wide"; // tires are only accessible here
        // Variables color and speed accessible here
    }
    
}


public class assignment3 {
    public static void main(String args[])
    {
        Car carObject = new Car("blue", 70);
        // Can access the public variable, color, in this class
        String carColor = carObject.color;
        // Can’t access the private variable, speed, in this class
        // int carSpeed = carObject.speed -- This results in an error, can’t access speed here
    }

}
