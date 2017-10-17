/*
Yonatan Mengesha

Inheritance

 */


package com.company;
//vehicle Class
public class Vehicle {

    //declaring the type of the vehicle
    private String type;
    private String vYear;

    //getter method for the year
    public String getvYear() {
        return vYear;
    }

    //setter method for the year
    public void setvYear(String vYear) {
        this.vYear = vYear;
    }

   //getter method for the type of the car
    public String getType() {
        return type;
    }

    //setter method for the type of the car
    public void setType(String type) {
        this.type = type;
    }

    //Accelerate method for the vehicle
    public String Accelerate()
    {
         return "Vehicle Accelerating";
    }
    //move method for the vehicle
    public String move()
    {
        return "Vehicle is moving ";
    }


}
