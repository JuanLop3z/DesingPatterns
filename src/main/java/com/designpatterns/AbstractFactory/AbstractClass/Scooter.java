/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpatterns.AbstractFactory.AbstractClass;

/**
 *
 * @author JuanSebastianLopezGa
 */
public abstract class Scooter {
    protected String model;
    protected String color;
    protected int power;

    public Scooter(String model, String color, int power) {
        this.model = model;
        this.color = color;
        this.power = power;
    }
    
    public abstract void showFeatures();
}
