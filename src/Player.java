import java.util.ArrayList;

/**
 *  
 * @author Abdalla Fadal Shehata
 * @author Mostafa Nasse Mohamed
 *
 */
 public class Player extends User {
         
            ArrayList<Booking> myBookings;
            private eWallet myWallet;
            
           public Player() 
           {
               myBookings = new ArrayList<Booking>();
               myWallet = new eWallet();
           }
           /**
            * 
            * @param name of the player
            * @param password  password of the player
            * @param eMail email of the player
            * @param phoneNumber phone of the player
            * @param ID National ID of the player
            * @param city
            */
           public Player(String name,String password,String eMail, String phoneNumber, String ID, String city) 
           {
              super(name,password, eMail,phoneNumber,ID,city);
          }
           
           
           /**
            * dispaly ewallet Information
            */
           public void viewWallet() 
           {
        	   System.out.println(myWallet);
           }
           /**
            * 
            * @param id of the ewallet
            * @param amount to put in the ewallet
            */
           
           public void setWallet(int id, double amount) 
           {
        	    eWallet a = new eWallet(id,amount);
        	    myWallet = a;           
        	  }
           /**
            * 
            * @param b add a booking to the player bookings
            */
           
           public void addBooking(Booking b) 
           {
        	   this.myBookings.add(b);
        	   
           }
           /**
            * display player Bookings
            */
           public void view_MyBookings() 
           {
        	   int SZ = myBookings.size();
        	   for(int i = 0; i < SZ; ++i) 
        	   {
        		  System.out.println(myBookings.get(i));
        	   }
           }
           /**
            * 
            * @param id of booking that will be deleted
            */
           public void deleteBookings(int id) 
           {
        	   int index  = 0;
        	   int SZ = myBookings.size();
        	   for(int i = 0; i < SZ; ++i) 
        	   {
        		 Booking b =   myBookings.get(i);
        		 if(b.getId() == id) {
        			 index = i;
        			 break;
        		 }
        	   }
        	   myBookings.remove(index);
           }
           
           /**
            * 
            * @return wallet of player
            */
           public eWallet getMywallet() 
           {
        	   return this.myWallet;
           }
           
 }        
           
          
        
    
        
         