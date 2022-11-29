/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpatterns.AbstractFactory.Class;

import com.designpatterns.AbstractFactory.AbstractClass.Car;

/**
 *
 * @author JuanSebastianLopezGa
 */
public class ElectricCar extends Car{
    
    
    //the attributes that will be inherited are applied
    public ElectricCar(String model, String color, int power, double space)
    {
        super(model, color, power, space);
    }
    
    
    //abstract class method to show characteristics of the concrete class
    public void showFeatures()
    {
        System.out.println("Electric car model: " + model + " of color: " + color + " of power: " + power + " of space: " + space);
    }
}
