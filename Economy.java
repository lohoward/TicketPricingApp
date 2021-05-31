
package Ryanair_Flight_app;

/**
 * Ryanair Ticket App
 * Economy.java
 * @author Louise Howard
 */

//this is a child class inherting from Ticket.javaS
public class Economy extends Ticket{
    public Economy(){
        super();
    }
    
    public Economy(int seatPrice){
        super(seatPrice);
    }
    
    public void compute(){
        this.seatPrice = 50;
    }
    
    
        
        
    
    
    
     
}
