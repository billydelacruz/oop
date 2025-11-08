/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;
import java.util.*;
/**
 *
 * @author admin
 */
public class DriverOOA {
    public static void main(String[] args){
        List<Exercise> exercises = new ArrayList<>();
        
        Exercise s1 = new Soccer(12.5);
        Exercise s2 = new Sprint(0.1);
        Exercise s3 = new Stroll(10);
        Exercise s4 = new RaceWalking(5);
        
        exercises.add(s1);
        exercises.add(s2);
        exercises.add(s3);
        exercises.add(s4);
        
        
        
        performExercises(exercises);
    }
    
    public static void performExercises(List<Exercise> exercises){
        for(Exercise e : exercises){
        
            if (e instanceof BallSport){
                System.out.println(e.getClass().getSimpleName());
            }
            
             if (e instanceof OlympicSport){
                System.out.println(e.getClass().getSimpleName());;
            }
             
             e.move();
             System.out.println("Distance covered: " + e.distanceCovered() + " km\n");
        }
    
    }
}
