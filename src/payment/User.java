package payment;
public class User 
{
	private String name;
	private long number;
	private int pin;
	private Account no;
	public User(String name,long number,int pin,Account no)
	{
		this.name=name;
		this.number=number;
		this.pin=pin;
		this.no=no;
	}
	public String getName() 
	{
		return name;
	}
	public long getNumber() 
	{
		return number;
	}
	public int getPin() 
	{
		return pin;
	}
	public void DepositToAccount(double amount) 
	{
		no.deposit(amount);
	}
	public void WithdrawToAccount(double amount) 
	{
		no.withdraw(amount);
	}
	public double CheckBalance() 
	{
		no.checkbalance();
		return no.checkbalance();
	}
	
	
}
