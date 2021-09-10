import java.util.ArrayList;
/**
 * 
 * @author Mostafa Nasser Mohamed Ali
 *@author Ali Mohamed Abdelsamie
 */
public class Booking {
	protected ArrayList<Player> team;
	private Playground playground;
	private Slot info;
	


	Booking()
	{
		team = new ArrayList<Player>();
		info = new Slot();
		playground =new Playground();
	}

	/**
	 *
	 * @param playground playground that belong to this booking
	 * @param slot date and price of this booking
	 * @param player player that own this booking
	 */
	Booking(int id,Playground playground,Slot s)
	{
		this.playground = playground;
		info = s;
		
	}
	/**
	 *
	 * @return team that are contributed in this booking
	 */
	public ArrayList<Player> getTeam() 
	{
		return team;
	}

	/**
	 * 
	 * @param p add player to the team
	 */
	public void addPlayer(Player  p) 
	{
		this.team.add(p);
	}
	
	/**
	 * 
	 * @param delete a player from the team
	 */

	public void deletPlayer(String  name)
	{
		int index= 0 ; boolean flag = false;
		for(int i = 0; i < team.size(); ++i) {
			if(team.get(i).getName().equalsIgnoreCase(name)) 
			{
				index = i;
				flag = true;
				break;
			}
		}
		if(flag) 
		{
			this.team.remove(index);
		}
		else 
		{
			System.out.println("There is no player found with this name");
		}
		
		
	}
	
	
}
