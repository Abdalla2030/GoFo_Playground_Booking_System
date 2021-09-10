/**
 * 
 * @author Mostafa Nasser Mohamed Ali
 *
 */
public class Adress {
	 private String location;
	    private String city;
	    private String neighborhood;
	    
	    
	    
	   public Adress()
	   {
	    	location = "";
	    	city = "";
	    	neighborhood = "";
	    }
	   /**
	    * 
	    * @param location
	    * @param city
	    * @param neighborhood
	    */
	   public Adress(String location, String city, String neighborhood)
	   {
		   
		   this.location = location;
		   this.city = city;
	       this.neighborhood = neighborhood;
		   
	   }
	    
	    /**
	     *
	     * @param location of the playground
	     */
	    public void setLocation(String location)
	    {
	        this.location=location;
	    }

	    /**
	     *
	     * @param city city of the playground
	     */
	    public void setCity(String city) {
	        this.city = city;
	    }

	    /**
	     *
	     * @param neighborhood neighborhood of the playground
	     */
	    public void setNeighborhood(String neighborhood)
	    {
	        this.neighborhood=neighborhood;
	    }

	    /**
	     *
	     * @return location
	     */
	    public String getLocation() 
	    {
	        return location;
	    }

	    /**
	     *
	     * @return playground city
	     */
	    public String getCity() 
	    {
	        return city;
	    }

	    /**
	     *
	     * @return playground Neighborhood
	     */
	    public String getNeighborhood() 
	    {
	    	return neighborhood;
	    }
}
