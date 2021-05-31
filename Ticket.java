package Ryanair_Flight_app;

import java.util.ArrayList;

/**
 * Ryanair Ticket App
 * Ticket.java
 *@author Louise Howard
 */

//The Parent Class, all our other classes inherit from this.
public class Ticket {
    
    /*Below we created code for choosing a random seat number for a ticket.
     *We used an ArrayList along wiht loop and if statements to choose each seat number.
    */
    protected int seatPrice = 0;
    public String randomSeat;
    
    public ArrayList<String> seatNum;
    private int maxNbTickets=79;
    
    public Ticket(){
        
        seatNum = new ArrayList<String>();
        
        for (int i=0;i<maxNbTickets;i++){
            
            String l;
            if ((i / 5)==0) l="A";

            else if ((i/5)==1) l="B";
            
            else if ((i/5)==2) l="C";
            
            else if ((i/5)==3) l="D";

            else if ((i/5)==4) l="E";
            
            else if ((i/5)==5) l="F";
                
            else if ((i/5)==6) l="G";
            
            else if ((i/5)==7) l="H";

            else if ((i/5)==8) l="I";
            
            else if ((i/5)==9) l="J";
            
            else if ((i/5)==10) l="K";

            else if ((i/5)==11) l="L";
            
            
            else  l="M";
            
            //The code below keeps the seat between 1-5.
            seatNum.add(l+((i%5)+1));
        }
        
        
        
    }
    // Setters and getters go here
    public Ticket(int SeatPrice){
        this.seatPrice = SeatPrice;
    }

    public int getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(int seatPrice) {
        this.seatPrice = seatPrice;
        
        
        
    }
    
    //get method for seat number
    public String getSeatNum(){
        int i =  (int)(Math.random()* maxNbTickets);
        randomSeat=seatNum.get(i); 
        return randomSeat;
        
        
    }
    
    
     
    
    
     
     
     
 
    
   
}

