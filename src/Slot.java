import java.util.Date;

/**
 * 
 * @author Abdalla Fadl 
 * @author Mostafa Nasser Mohamed Ali
 *
 */
public class Slot {

	private String startDate;
	private double price;
	private String endDate;
	boolean status;

	Slot(){
		
		startDate="";
		price=0;
		endDate="";
		status = true;
	}

	/**
	 *
	 * @param playground playground that has this slot
	 * @param startDate start date of the slot day/hour
	 * @param price of the slot
	 * @param endDate endtDate start date of the slot day/hour
	 */
	Slot(String startDate,String endDate, double price)
	{
		this.startDate=startDate;  
		this.price=price;
		this.endDate=endDate;
		status = true;
	}

	
	/**
	 *
	 * @param endDate set the end date of the slot
	 */
	public void setEndDate(String endDate) 
	{
		this.endDate = endDate;
	}

	/**
	 *
	 *
	 * @param price price of the slot
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}

	/**
	 *
	 * @param startDate set start date of the slot
	 */
	public void setStartDate(String startDate) 
	{
		this.startDate = startDate;
	}
	/**
	 * 
	 * @param s set status of slot if it has been reserved to false
	 */
	public void setStatus(boolean s) 
	{
		this.status = s;
	}
	/**
	 * 
	 * @return get the status of the slot to know if has been reserved or not
	 */
	public boolean getStatus() 
	{
		return status;
	}

	/**
	 * 
	 * @return end date
	 */
	public String getEndDate()
	{
		return endDate;
	}

	/**
	 * 
	 * @return start date
	 */
	public String getStartDate() 
	{
		return startDate;
	}

	/**
	 * 
	 * @return price of the slot
	 */
	public double getPrice() 
	{
		return price;
	}

	
}
