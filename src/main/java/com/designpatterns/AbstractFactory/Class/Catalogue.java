/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpatterns.AbstractFactory.Class;

import com.designpatterns.AbstractFactory.AbstractClass.Car;
import com.designpatterns.AbstractFactory.AbstractClass.Scooter;
import com.designpatterns.AbstractFactory.Interface.VehicleFactory;
import java.util.Scanner;

/**
 *
 * @author JuanSebastianLopezGa
 */
public class Catalogue {
    
    public static int nCar = 3;
    public static int nScooters = 2;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        VehicleFactory factory;
        Car [] cars = new Car [nCar];
        Scooter [] scooters = new Scooter[nScooters];
        
        System.out.println("Do you want to use " + "electric vehicles (1) or gasoline (2): ");
        
        String select = sc.next();
        
        if (select.equals("1")) {
            factory = new FactoryVehicleElectricity();
        }
        else{
            factory = new FactoryVehicleGasoline();
        }
        
        for (int i = 0; i < nCar; i++) {
            cars [i] = factory.createCar("standard", "Yellow", 6+i, 3.2);
            cars [i] = factory.createCar("Standard", "Blue", 4+i, 4.5);
        }
        for (int i = 0; i < nScooters; i++) {
            scooters [i] = factory.createScooter("classic", "red", 2+i);
        }
        for (Car car: cars) {
            car.showFeatures();
        }
        for (Scooter scooter: scooters) {
            scooter.showFeatures();
        }
    }
}
