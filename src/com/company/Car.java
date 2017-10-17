/*
Yonatan Mengesha

Inheritance

 */



package com.company;
//Car class inheriting from vehicle
public class Car extends Vehicle {
    //declaring the color of the car
    private String carColor;
    //declaring the model of the car
    private String carModel;
    //declaring the yar the car was made
    private String carYear;
    //declaring the speed of th car
    private String speed;





    //cars empty constructor
    public Car()
    {
        System.out.println ("Created a car Object!" );
    }
    //cars constructor with methods
    public Car(String carColor,String carModel,String carYear)
    {
        this.carColor=carColor;
        this.carModel=carModel;
        this.carYear=carYear;
    }
    //getter/setter  method for the declared variables
    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }


    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    //Methods of the Car

    public String Accelerate()
    {
        return "The car is accelerating";
    }

    public String changeGear()
    {
        return "Car changing Gear";
    }
    public String move()
    {
        return "Moving";
    }

    //A method to display information about the car
    public String Display()
    {
         String result;
         result="The "+getCarColor ()+" Cars Model is "+getCarModel ()+" It is "+move ()+"\n"+
                 "And it  is accelerating in a speed of  "+getSpeed ()+"\n"+
                 "The car is manufactured on "+getCarYear ();
         return result;

    }


}
