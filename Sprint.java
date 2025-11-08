/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author admin
 */
public class Sprint extends Run{
    public Sprint(double distanceKm){
        super(distanceKm);
    }
    @Override
    public void move(){
        System.out.println(getClass().getSimpleName() + "::moving");
    }
}


