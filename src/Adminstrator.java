import java.util.ArrayList;

/**
 * 
 * @author Abdalla Fadl 
 * @author Mostafa Nasser Mohamed Ali
 *
 */
public class Adminstrator extends User{
	
	
	
	public Adminstrator(String name, String Password,String email) 
	{
		super(name,Password,email,"","","");
	}
	/***
	 * 
	 * @param currentPlaygrounds that admin will active playground from it
	 * @param playgroundID to search for play ground with this id and active it
	 */
	public void activatePlayground(ArrayList<Playground> currentPlaygrounds, int playgroundID) 
	{
		int index = 0;
		boolean flag = false;
		for (int i = 0; i < currentPlaygrounds.size(); ++i) 
		{
			if (currentPlaygrounds.get(i).getId() == playgroundID)
			{
				flag = true;
				index = i;
				break;
			}
		}
		if (flag) 
		{
			currentPlaygrounds.get(index).setStatus(true);
		} 
		else 
		{
			System.out.println("There is no play ground of this name");
		}

	}
	
	/***
	 * 
	 * @param currentPlaygrounds that admin will suspend playground from it
	 * @param playgroundID to search for play ground with this id and suspend it
	 */
	public void susbendPlayground( ArrayList<Playground> currentPlaygrounds, int playgroundID)
	{
    	  int index = 0 ; boolean flag = false;
                for(int i = 0 ; i < currentPlaygrounds.size(); ++i) 
                {
                	if(currentPlaygrounds.get(i).getId() == playgroundID) 
                	{
                		flag = true;
                		index = i;
                		break;
                	}
                }
                if(flag) 
                {
                	currentPlaygrounds.get(index).setStatus(false);
                }
                else 
                {
                	System.out.println("There is no play ground of this name");
                }
	}            
   /**
    * 
    * @param currentPlaygrounds that admin will delete playground from it
    * @param playgroundID playgroundID to search for play ground with this id and d it
    */

	public void deletePlayground( ArrayList<Playground> currentPlaygrounds, int playgroundID) 
	{
              	  int index = 0 ; boolean flag = false;
                          for(int i = 0 ; i < currentPlaygrounds.size(); ++i) 
                          {
                          	if(currentPlaygrounds.get(i).getId() == playgroundID) 
                          	{
                          		flag = true;
                          		index = i;
                          		break;
                          	}
                          }
                          if(flag) 
                          {
                          	currentPlaygrounds.remove(index);
                          }
                          else 
                          {
                          	System.out.println("There is no play ground of this name");
                          }
          
            
}
	
}
