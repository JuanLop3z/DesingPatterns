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
public class FactoryVehicleElectricity implements VehicleFactory{
    
    /*se implementa los metodos de la interfaz que devuelven los valores creados, esto se realiza para poder trabajar de mejor manera con los datos*/
    public Car createCar(String model, String color, int power, double space)
    {
        return new ElectricCar(model, color, power, space);
    }
    
    public Scooter createScooter(String model, String color, int power)
    {
        return new ElectricScooter(model, color, power);
    }
    
}
