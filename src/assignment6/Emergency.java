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
public class Emergency extends Vehicle {    
    private final double emergencyTollCharge = 0;    
    
    public Emergency() {             
        setTollCharge(emergencyTollCharge);
    }
    
    @Override
    public String toString() {
        return "Emergency vehicle";
    }
}
