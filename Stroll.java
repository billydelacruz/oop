/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author admin
 */
public class Stroll extends Walk {
    public Stroll(double distanceKm){
        super(distanceKm);
    }
    @Override
    public void move(){
        System.out.println(getClass().getSimpleName() + "::moving");
    }
}
