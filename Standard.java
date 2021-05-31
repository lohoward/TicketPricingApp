
package Ryanair_Flight_app;

/**
 * Ryanair Ticket App
 * Standard.java
 *@author Louise Howard
 */

//this is a child class inherting from Ticket.java
public class Standard extends Ticket{
 
    
    public Standard(){
        super();
    }
    
    public Standard(int seatPrice){
        super(seatPrice);
    }
    
    public void compute(){
        this.seatPrice = 5;
    }
    
    
    
}
