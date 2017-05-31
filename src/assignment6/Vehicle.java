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
public class Vehicle {   
    
    private Owner owner;
    private String licensePlate;
    private String accountNumber;
    private double tollCharge = 0;
    private double totalCharge = 0;
    
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getTollCharge() {
        return tollCharge;
    }

    public void setTollCharge(double tollCharge) {
        this.tollCharge = tollCharge;
    }

    public double getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(double totalCharge) {
        this.totalCharge = totalCharge;
    }    
    
    public void crossingBridge() {
        System.out.println("A "+ this.toString() +" crosses the bridge...");
        setTotalCharge(getTotalCharge() + tollCharge);
    }
    
    @Override
    public String toString() {
        return "Vehicle";
    }
}
