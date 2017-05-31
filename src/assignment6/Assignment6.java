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
public class Assignment6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // car 
        Vehicle lamborghini = new Car();
        Person lamboOwner = new Person();
        lamboOwner.setFirstName("Haji");
        lamboOwner.setLastName("Ali");        
        lamborghini.setOwner(lamboOwner);       
        
        Vehicle ferrari = new Car();
        Person ferrariOwner = new Person();
        ferrariOwner.setFirstName("James");
        ferrariOwner.setLastName("Newton");
        ferrari.setOwner(ferrariOwner);
        
        // truck
        Truck dumpTruck = new Truck();        
        Corporate corp = new Corporate();
        corp.setCorporateName("XXX Corp.");
        dumpTruck.setOwner(corp);
        
        // emergency vehicle
        Emergency ambulance = new Emergency();
        Government govt = new Government();
        govt.setGovernmentName("YYY Gov.");
        ambulance.setOwner(govt);
        
        // crossing the bridge
        lamborghini.crossingBridge();
        lamborghini.crossingBridge();
        
        // check for current total
        System.out.println("Total toll charge for "+lamboOwner.getFirstName()+"'s Lamborghini car : $" + lamborghini.getTotalCharge());
        
        // crossing 
        ferrari.crossingBridge();
        lamborghini.crossingBridge();
        ferrari.crossingBridge();
        
        dumpTruck.crossingBridge();
        ambulance.crossingBridge();
        ambulance.crossingBridge();
        ambulance.crossingBridge();
        dumpTruck.crossingBridge();
        
        System.out.println("Total toll charge for "+lamboOwner.getFirstName()+"'s Lamborghini car : $" + lamborghini.getTotalCharge());
        System.out.println("Total toll charge for "+ferrariOwner.getFirstName()+"'s Ferrari car : $" + ferrari.getTotalCharge());
        System.out.println("Total toll charge for "+corp.getCorporateName()+"'s dump truck : $" + dumpTruck.getTotalCharge());
        System.out.println("Total toll charge for "+govt.getGovernmentName()+"'s ambulance : $" + ambulance.getTotalCharge());
    }
    
}
