package payment;

public class Main {
	public static void main(String[] args) {
		Account no=new Account(1000);
		User sc=new User("Muthu",9047422460l,2804,no);
		sc.DepositToAccount(1000);
		sc.WithdrawToAccount(500);
		System.out.println("Name : "+sc.getName());
		System.out.println("Balance is:"+sc.CheckBalance());
		UserService service = new UserService();
		
		
		User u3=new User("Muthu",9047422460l,2804,new Account(5000));
		User u1=new User("Krish",1111l,7012,new Account(900));
		User u2=new User("kamal",2222l,7312,new Account(2000));
		service.addUser(u1);
		service.addUser(u2);
		service.addUser(u3);
		service.transferMoney(9047422460l,2222l,4000);
		System.out.println("The balance of :"+service.checkBalance(9047422460l)+"   "+"Name: "+service.getName(9047422460l));
		System.out.println("The balance of :"+service.checkBalance(2222l)+"   "+"Name: "+service.getName(2222l));
		
		
	}

}
