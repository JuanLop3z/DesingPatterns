/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpatterns.AbstractFactory.Class;

import com.designpatterns.AbstractFactory.AbstractClass.Scooter;

/**
 *
 * @author JuanSebastianLopezGa
 */
public class ElectricScooter extends Scooter{
    
        //the attributes that will be inherited are applied
    public  ElectricScooter(String model, String color, int power)
    {
        super(model, color, power);
    }
    
    
    //abstract class method to show characteristics of the concrete class
    public void showFeatures()
    {
        System.out.println("Model electric Scooter: " + model + " of color: " + color + " of power: " + power);
    }
    
}
