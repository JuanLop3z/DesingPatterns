/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpatterns.AbstractFactory.AbstractClass;

/**
 *
 * @author JuanSebastianLopezGa
 */

//An abstract class is created with the general attributes of cars
public abstract class Car {
    protected String model;
    protected String color;
    protected int power;
    protected double space;
    
    
    //Constructor to be able to use the attributes of the class
    public Car(String model, String color, int power, double space) {
        this.model = model;
        this.color = color;
        this.power = power;
        this.space = space;
    }
    
    
    //method to display features applying polymorphism
    public abstract void showFeatures();
    
}
