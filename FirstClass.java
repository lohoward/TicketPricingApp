package Ryanair_Flight_app;

/**
 * Ryanair Ticket App
 * FirstClass.java
 * @author Louise Howard
 */


//Our instaniable class for creating tickets for First Class tickets


//this is a child class inherting from Ticket.java
public class FirstClass extends Ticket{
    public FirstClass(){
        super();
    }
    
    public FirstClass(int seatPrice){
        super(seatPrice);
    }
    
    public void compute(){
        this.seatPrice = 200;
    }
    
     
}   

