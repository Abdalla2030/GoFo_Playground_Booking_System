import java.util.ArrayList;

/**
 * @author Ali Mohamed Abdelsamie
 */
public class eWallet {
	private double balance;
	private int id;


	public eWallet()
	{
		balance=0;
		id=0;
	}

	/**
	 *
	 * @param id
	 * @param balance to be added in the eWallet
	 */
	public eWallet(int id,double balance)
	{
		this.balance=balance;
		this.id=id;
	}

	/**
	 *
	 * @param amount amount of money user want to withdraw
	 * 
	 */
	public void withdraw(double amount)
	{
		if(balance>=amount){
			balance -= amount;
		}
		else {
			System.out.println("There is no enough money in your ewallet");
		}
	}

	/**
	 *
	 * @param amount add money to your eWallet
	 * 
	 */
	public  void deposit(double amount)
	{
		balance += amount;
		
	}

	

	/**
	 * 
	 * @return id of eWallet
	 */
	public int getId() 
	{
		return id;
	}

	/**
	 * 
	 * @return return current money in the eWallet
	 */
	public double getBalance()
	{
		return balance;
	}
}
