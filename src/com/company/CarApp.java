/*
Yonatan Mengesha

Inheritance

 */

package com.company;

public class CarApp {
    //This is the main method

    public static void main(String[] args) {
	// write your code here

        //creating a vehicle object

        Vehicle v= new Vehicle();
        //creating a car object
        Car c= new Car();
        //set the speed of the car
        c.setSpeed ( "50" );
        //set the year of the car
        c.setCarYear ( "2018" );
        //set the color of the car
        c.setCarColor ( "white" );
        //set the model of the car
        c.setCarModel ( "BMW" );

        //Display
        System.out.println (c.Display () );


    }
}
