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
public class Truck extends Vehicle {

    private final double truckTollCharge = 3;
    
    public Truck() {        
        setTollCharge(truckTollCharge);        
    }
    
    @Override
    public String toString() {
        return "Truck";
    }
}
