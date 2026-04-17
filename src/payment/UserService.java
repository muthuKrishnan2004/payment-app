package payment;
import java.util.HashMap;
public class UserService {
	private HashMap<Long,User> users=new HashMap<>();
	/**add user**/
	public void addUser(User user) 
	{
		this.users.put(user.getNumber(),user);
	}
	/**get user**/
	public User getUser(Long number) 
	{
		return users.get(number);
	}
	/**Transaction**/
	public void transferMoney(long from,long to,double amount) 
	{
		User sender=users.get(from);
		User receiver=users.get(to);
		if( sender==null || receiver==null) 
		{
			System.out.println("Invalid user kindly verify and enter the number :(");
			return;
		}
		else if(amount>sender.checkBalance()) 
		{
			System.out.println("Insufficient Funds :/");
			return;
		}
		else if(amount<=0) 
		{
			System.out.println("The amount entered cannot be zero ???? Really");
			return;
		}
			sender.withdrawToAccount(amount);
			receiver.depositToAccount(amount);
			System.out.println("Transaction is successfully done :)");
	
	}
	public double checkBalance(long number) 
	{
		User user=this.users.get(number);
		if(user==null) 
		{
			
		}
		return user.checkBalance();
		
	}
	public String getName(Long number) 
	{
		User user=this.users.get(number);
		if(user == null) 
		{
			return "User not found";
		}
		return user.getName();
	}
}
