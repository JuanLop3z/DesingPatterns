/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpatterns.AbstractFactory.Class;

import com.designpatterns.AbstractFactory.AbstractClass.Car;
import com.designpatterns.AbstractFactory.AbstractClass.Scooter;
import com.designpatterns.AbstractFactory.Interface.VehicleFactory;

/**
 *
 * @author JuanSebastianLopezGa
 */

public class FactoryVehicleGasoline implements VehicleFactory{
    /*the methods of the interface that return the created values are implemented, 
    this is done to be able to work better with the data*/
    public Car createCar(String model, String color, int power, double space)
    {
        return new GasolineCar(model, color, power, space);
    }
    
    public Scooter createScooter(String model, String color, int power)
    {
        return new GasolineScooter(model, color, power);
    }
}
