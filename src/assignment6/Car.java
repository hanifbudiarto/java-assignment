/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

/**
 *
 * @author Hanif
 */
public class Car extends Vehicle {    
    private final double carTollCharge = 5;
    
    public Car() {
        setTollCharge(carTollCharge);
    }
    
    @Override
    public String toString() {
        return "Car";
    }
}
