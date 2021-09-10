
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Mostafa Nasser Mohamed ali
 * @author Ali Mohamed Abdelsamie
 * this main has not been completed yet it has many bugs to fix 
 */
public class Main {
    static void menu()
    {
        System.out.println("1- Register");
        System.out.println("2- Login");
        System.out.println("3- Exit");
    }
    
    static void LoginMenu()
    {
        System.out.println("1- Player");
        System.out.println("2- PlaygroundOwner");
        System.out.println("3- Admin");
        System.out.println("4- Return back");
    }
    
    static void RegisterMenu()
    {
        System.out.println("1- Player");
        System.out.println("2- PlaygroundOwner");
        System.out.println("3- Return back");
    }
    static void playerMenu()
    {
        System.out.println("1- Create eWallet");
        System.out.println("2- Display Playgrounds");
        System.out.println("3- Book Playground");
        System.out.println("4- ViewBookings");
        System.out.println("5- Access eWallet");
        System.out.println("6- Return back");
    }
    static void playgroundMenu()
    {
        System.out.println("1- Display all");
        System.out.println("2- Filter using playground name");
        System.out.println("3- Filter using playground number");
        System.out.println("4- Return back");
    }
    static void playergroundOwnerMenu()
    {
        System.out.println("1- Create eWallet");
        System.out.println("2- Display myPlaygrounds");
        System.out.println("3- Add Playground");
        System.out.println("4- Add slot");
        System.out.println("5- Access eWallet");
        System.out.println("6- Return back");

    }

     static Player playerinfo() 
     {
    	  Scanner input =new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = input.nextLine();

        System.out.println("Enter password: ");
        String password = input.next();
        
        System.out.println("Enter Email: ");
        String email = input.next();


        System.out.println("Enter NationalId: ");
        String NationalId = input.next();

        System.out.println("Enter city: ");
        String city = input.next();

        System.out.println("Enter Phone: ");
        String Phone = input.next();

        System.out.println("The registration process has been completed successfully\n");
        Player p = new Player(name,password, email,Phone,NationalId,city);
        return p;
    }
     
     
     
     static PlaygroundOwner playgroundOwnerinfo() 
     {
   	  Scanner input =new Scanner(System.in);
       System.out.println("Enter Name: ");
       String name = input.nextLine();

       System.out.println("Enter password: ");
       String password = input.next();
       
       System.out.println("Enter Email: ");
       String email = input.next();


       System.out.println("Enter NationalId: ");
       String NationalId = input.next();

       System.out.println("Enter city: ");
       String city = input.next();

       System.out.println("Enter Phone: ");
       String Phone = input.next();

       System.out.println("The registration process has been completed successfully\n");
       PlaygroundOwner p = new PlaygroundOwner(name,password, email,Phone,NationalId,city);
       return p;
   }
     
     static Playground addplayground() 
     {
    	 Scanner input =new Scanner(System.in);
    	 System.out.println("Enter PlaygroundOwnerName: ");
         String ownername = input.nextLine();
         
         System.out.println("Enter PlaygroundName: ");
         String name = input.nextLine();

         System.out.println("Enter id: ");
         int id = input.nextInt();
         
         System.out.println("Enter capcity: ");
         int capcity = input.nextInt();


         System.out.println("Enter type: ");
         String type = input.next();

         System.out.println("Enter city: ");
         String city = input.next();

         System.out.println("Enter location: ");
         String location = input.next();
         
         System.out.println("Enter neighborhood: ");
         String neighborhood = input.next();
         
        Adress address = new  Adress( location,  city,  neighborhood);
       Playground P = new Playground(ownername,name,id,address,type,capcity);
       return P;
     }
     
     
     static void adminMenu() 
     {
    	 System.out.println("1- Displayplayground");
    	 System.out.println("2- Active Playground");
    	 System.out.println("3- Suspend Playground");
    	 System.out.println("4- Delete Playground");
    	 System.out.println("5- Exit");

     }
     
     /**
      * 
      * @param p array list of playgrounds
      */
     static void viewPlaygrounds(ArrayList<Playground>p) 
     {
    	 for(int i = 0; i < p.size(); ++i) 
    	 {
    		 System.out.println(p.get(i));
    	 }
     }
     /**
      * 
      * @param p array list of playgrounds
      * @param name name that to be searched
      */
     static void filterPlaygrounds_Name(ArrayList<Playground>p,String name)
     {
    	 for(int i = 0; i < p.size(); ++i) 
    	 {
    		 if(p.get(i).getName().equalsIgnoreCase(name) ) 
    		 {
    			 System.out.println(p.get(i));
    		 }
    		
    	 }
     }
     /**
      * 
      * @param p array list of playgrounds
      * @param location of playground that we search for 
      */
     static void filterPlaygrounds_location(ArrayList<Playground>p,String location) 
     {
    	 for(int i = 0; i < p.size(); ++i) 
    	 {
    		 if(p.get(i).getAdress().getLocation().equalsIgnoreCase(location) ) 
    		 {
    			 System.out.println(p.get(i));
    		 }
    		
    	 }
     }
    
    
    
 public static void main(String[] args) {
    	
    	Adminstrator systemAdmin = new Adminstrator("admin","123456","admin@gmail.com");
    	System.out.println(systemAdmin);
    	String email, password,username;
    	int choice = 1;
    	int bookingNumber = 1;
    	ArrayList<Playground>currentPlaygrounds = new ArrayList<Playground>();
    	
    	ArrayList<PlaygroundOwner>currentplaygroundsOwners = new ArrayList<PlaygroundOwner>();
    	
    	ArrayList<Player>currentPlayers = new ArrayList<Player>();
       
            System.out.println("Welcome To GoFo");
            System.out.println("-----------------");
            
            menu();
            
            Scanner input =new Scanner(System.in);
            
            choice = input.nextInt();
            
            Player p = new Player(); 
            PlaygroundOwner o = new PlaygroundOwner();
    //Start Menu        
            while(choice != 3) 
            {
            	
            	 
            	switch(choice) 
            	{
 //////////////////////////////////////////////////////////////////////////////////////// 
            	//
            	case 1: 
            	{
            		RegisterMenu();
            		int user_choice;
            		user_choice = input.nextInt();
            		switch(user_choice) 
            		{
	            		case 1:
	            		{
	            			p = playerinfo();
	            			currentPlayers.add(p);
	            			System.out.println("Player has been added to the system");
	            			break;
	            			
	            		}
	            		case 2:
	            		{
	            			o = playgroundOwnerinfo();
	            			currentplaygroundsOwners.add(o);
	            			System.out.println("Playground Owner has been added to the system");
	            			break;
	            			
	            		}
	            		case 3:{
	            			break;
	            		}
            		}
            		break;
            	}//end of registration
/////////////////////////////////////////////////////////////// ///////////////////////           			
            	///Login Menu
            	case 2:
            	{
            		
            		LoginMenu();
            		int login_choise = input.nextInt();
            		if(login_choise == 1) 
            		{
            			System.out.println("Please enter email:  ");
            			email = input.next();
            			System.out.println("Please enter password:  ");
            			password = input.next();
            			int player_index = 0;
            			boolean flag = false;
            			for(int i = 0; i < currentPlayers.size(); ++i) 
            			{
            				if(currentPlayers.get(i).getEmail() == email  && currentPlayers.get(i).getPassword() == password) 
            				{
            					flag = true;
            					player_index = i;
            					break;
            				}
            			}
            				
            				
            				if(flag) 
            				{
            					
            					playerMenu();
            					int playerchoice = input.nextInt();
            					switch(playerchoice) 
            					{
            						case 1:
            						{
            							int id; double balance;
            							System.out.println("Enter Your ewallet ID: ");
            							id = input.nextInt();
            							System.out.println("Enter The amount of balance: ");
            							balance = input.nextDouble();
            							currentPlayers.get(player_index).setWallet(id, balance);
            							break;
            						}
            						case 2:
            						{
            							playgroundMenu();
            							int playgroundchoice; 
            							playgroundchoice = input.nextInt();
            							switch(playgroundchoice) 
            							{
	            							case 1:
	            							{
	            								viewPlaygrounds(currentPlaygrounds);
	            								break;
	            							}
	            							case 2:
	            							{
	            								System.out.println("Enter Playground name");
	            								String name;
	            								name = input.nextLine();
	            								filterPlaygrounds_Name(currentPlaygrounds,name);
	            								break;
	            							}
	            							case 3:
	            							{
	            								System.out.println("Enter Playground location");
	            								String loc;
	            								loc = input.nextLine();
	            								filterPlaygrounds_location(currentPlaygrounds,loc);
	            								break;
	            							}
	            							case 4:
	            							{
	            								break;
	            							}
            							}
            							break;
            						}
            						
            						case 3:
            						{
            							String  name; String startdate;  String endtdate;
            							System.out.println("Enter palyground name: ");
            							name = input.nextLine();
            							System.out.println("Enter Start date like this day/hour space sperated: ");
            							startdate = input.nextLine();
            							System.out.println("Enter End date like this day/hour  space sperated: ");
            							endtdate = input.nextLine();
            							boolean bookingflag = true;
            							
            							for(int i = 0; i < currentPlaygrounds.size(); ++i) 
            							{
            								ArrayList<Slot> currentplaygroundSlots = currentPlaygrounds.get(i).getAvailableSlots();
            								for(int j = 0; j < currentplaygroundSlots.size(); ++j) 
            								{
            									if(currentplaygroundSlots.get(j).getStartDate().equalsIgnoreCase(startdate)  
            											&&  currentplaygroundSlots.get(j).getEndDate().equalsIgnoreCase(endtdate) && currentplaygroundSlots.get(j).getStatus())
            									{
            										
            										Slot s = currentplaygroundSlots.get(j);
            										Booking b = new Booking(bookingNumber,currentPlaygrounds.get(i), s);
            										 currentplaygroundSlots.get(j).setStatus(false);
            										currentPlayers.get(player_index).addBooking(b);
            										currentPlayers.get(player_index).getMywallet().withdraw(s.getPrice());
            										bookingflag = false;
            										bookingNumber++;
            										break;
            									}
            								}
            								if(!bookingflag) 
                							{
                								break;
                							}
            							}
            							
            							break;
            						}
            						case 4: 
            						{
            							 currentPlayers.get(player_index).view_MyBookings();
            							 break;
            						}
            						
            						case 5:
            						{
            							currentPlayers.get(player_index).viewWallet();
            							break;
            						}
            						case 6:
            						{
            							playerMenu();
            							break;
            						}
            						
            					
            					
            				}
            				}
            				
            				else 
            				{
            						System.out.println("Email or passsword are not correct tryagin");
            						
            				}
            			
            		}
            		
            		else if(login_choise == 2) 
            		{
            			System.out.println("Please enter email:  ");
            			email = input.next();
            			System.out.println("Please enter password:  ");
            			password = input.next();
            			int playegroundOwner_index = 0;
            			boolean flag = false;
            			for(int i = 0; i < currentplaygroundsOwners.size(); ++i) 
            			{
            				if(currentplaygroundsOwners.get(i).getEmail() == email  && currentplaygroundsOwners.get(i).getPassword() == password ) 
            				{
            					flag = true;
            					playegroundOwner_index = i;
            					break;
            				}
            			}
            			if(flag) 
            			{
            				playergroundOwnerMenu();
            				int playgroundOnwerMenu_Choice;
            				playgroundOnwerMenu_Choice = input.nextInt();
            				
            				switch(playgroundOnwerMenu_Choice) {
            					case 1:
            					{
            						int id; double balance;
        							System.out.println("Enter Your ewallet ID: ");
        							id = input.nextInt();
        							System.out.println("Enter The amount of balance: ");
        							balance = input.nextDouble();
        							currentplaygroundsOwners.get(playegroundOwner_index).set_eWallet(id, balance);
        							break;
            					}
            					case 2:
            					{
            						currentplaygroundsOwners.get(playegroundOwner_index).displayMyplaygrounds();
            						break;
            					}
            					case 3:
            					{
            							Playground myplayground = addplayground();
            							currentplaygroundsOwners.get(playegroundOwner_index).addPlayground(myplayground);
            							currentPlaygrounds.add(myplayground);
            							break;
            					}
            					case 4:
            					{
            						String  name,startdate, endtdate;
            						int id;
            						double price;
            						
        							System.out.println("Enter palyground name: ");
        							name = input.nextLine();
        							
        							System.out.println("Enter palyground id: ");
        							id = input.nextInt();
        							
        							System.out.println("Enter Start date like this day/hour   space sperated: ");
        							startdate = input.nextLine();
        							
        							System.out.println("Enter End date like this day/hour  space sperated: ");
        							endtdate = input.nextLine();
        							
        							System.out.println("Enter the price");
        							price = input.nextDouble();
        							
        							boolean playgroundflag = true;
        							ArrayList<Playground> ownerPlaygrounds = currentplaygroundsOwners.get(playegroundOwner_index).myPlaygrounds();
        							for(int i = 0; i < ownerPlaygrounds.size(); ++i) {
        								if(ownerPlaygrounds.get(i).getName().equalsIgnoreCase(name)  && ownerPlaygrounds.get(i).getId() == id) {
        									Slot s = new Slot(startdate,endtdate,price);
        									break;
        								}
        							}
        							break;
            					}
            					case 5:
            					{
            						currentplaygroundsOwners.get(playegroundOwner_index).viewMywallet();
            						break;
            					}
            					case 6:
            					{
            						menu();
            					}
            					
            				
            				}
            				
            			}
            			else 
            			{
            				System.out.println("Email or passsword are not correct tryagin");
            			}
            				
            			
            		}
            		
            		else if(login_choise == 3) {
            			
            			
            			
            			System.out.println("Please enter name:  ");
            			username = input.next();
            			System.out.println("Please enter password:  ");
            			password = input.next();
            			
            			if( systemAdmin.getName() == username  &&  systemAdmin.getPassword() == password) 
            			{
            				adminMenu();
            				int adminChoice,id;
            				String pname;
            				adminChoice = input.nextInt();
            				switch(adminChoice) 
            				{
	            				case 1:
	            				{
	            					viewPlaygrounds(currentPlaygrounds);
	            					break;
	            				}
	            				
	            				case 2:
	            				{
	            					System.out.println("Enter playground name: ");
	            					pname = input.next();
	            					System.out.println("Enter playground id: ");
	            					id = input.nextInt();
	            					systemAdmin.activatePlayground(currentPlaygrounds, id);
	            					break;
	            				}
	            					
	            				case 3:
	            				{
	            					System.out.println("Enter playground name: ");
	            					pname = input.next();
	            					System.out.println("Enter playground ID: ");
	            					id = input.nextInt();
	            					systemAdmin.susbendPlayground(currentPlaygrounds, id);
	            					break;
	            				}
	            				
	            				case 4:
	            				{
	            					System.out.println("Enter playground name: ");
	            					pname = input.next();
	            					System.out.println("Enter playground id: ");
	            					id = input.nextInt();
	            					systemAdmin.deletePlayground(currentPlaygrounds, id);
	            					break;
	            				}
	            				
	            				case 5:
	            				{
	            					menu();
	            					break;
	            				}
	            				
            				}
            			}
            			
            			else 
            			{
            				System.out.println("Inavlid admin");
            				LoginMenu();
            			}
            			
            		}
            		
            		
            		
            	}
            	
            	
            	
 
            	}//end of switch
            	
            		menu();
            		choice = input.nextInt();
            	 

            }//end of while
           
}//end of main
}//end of class