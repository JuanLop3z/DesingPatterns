/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.designpatterns.AbstractFactory.Interface;

import com.designpatterns.AbstractFactory.AbstractClass.Car;
import com.designpatterns.AbstractFactory.AbstractClass.Scooter;

/**
 *
 * @author JuanSebastianLopezGa
 */

public interface VehicleFactory {
    
    //the methods to be able to access the attributes of the class and to be able to implement it
    Car createCar (String model, String color, int power, double space);
            
    Scooter createScooter (String model, String color, int power);
}
