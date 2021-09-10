import java.util.ArrayList;
/**
 * 
 * @author Abdalla Fadl Shehata
 *
 */
public class PlaygroundOwner extends User{
	private ArrayList<Playground> playgrounds;
	private eWallet Mywallet;
	
	public PlaygroundOwner() 
	{
		Mywallet = new eWallet();
		
		 playgrounds = new ArrayList<Playground>();     
	}
	/**
	 * 
	 * @param name of the   playground owner
	 * @param password of the playground owner as a user
	 * @param eMail email of the owner
	 * @param phoneNumber of the playground owner
	 * @param ID national ID of playground owner
	 * @param city
	 */
	public PlaygroundOwner(String name,String password,String eMail, String phoneNumber, String ID, String city) 
	{
        super(name,password, eMail,phoneNumber,ID,city);
        playgrounds = new ArrayList<Playground>();  
        Mywallet = new eWallet();
   }
	/**
	 * 
	 * @param playground take a playground object
	 */
   public void addPlayground(Playground playground) 
   {
        playgrounds.add(playground);
    }
   /**
    * 
    * @param playgroundname name of the playground
    * @param playgroundID ID of playground
    * @param slot slot to be added to that a playground
    */
   public void addSlot(String playgroundname, int playgroundID, Slot slot) 
   {
   	for (int i = 0; i < playgrounds.size(); i++) {
   				if(playgrounds.get(i).getName() == playgroundname && playgrounds.get(i).getId() == playgroundID) 
   				{
   					playgrounds.get(i).addSlot(slot);
           }
       }
    }
  
   /**
    * 
    * @param id of playgroundOwner ewallet
    * @param balance to be added to its ewallet
    */
   public void set_eWallet(int id ,double balance)
   {
	    Mywallet = new eWallet(id,balance);
   }
   
   /**
    * display ewallet of the playground owner
    */
   
   public void viewMywallet() 
   {
	   System.out.println(this.Mywallet);
   }
   /**
    * display  playground owner playgrounds
    */
	public void displayMyplaygrounds() 
	{
		for(int i = 0; i < playgrounds.size(); ++i) 
		{
			System.out.println(playgrounds.get(i));
		}
	}
	/**
	 * 
	 * @return playgrounds of that playground owner
	 */
	
	public ArrayList<Playground> myPlaygrounds()
	{
		return this.playgrounds;
	}
	
}
