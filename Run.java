/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author admin
 */
public abstract class Run implements Exercise{
    protected double distanceKm;
    
    public Run(double distanceKm){
        this.distanceKm = distanceKm;
    }
    
    @Override
    public double distanceCovered(){
        return distanceKm;
    }
    
}
