package payment;

public class Main {
	public static void main(String[] args) {
		Account no=new Account(1000);
		User sc=new User("Muthu",9047422460l,2804,no);
		sc.DepositToAccount(1000);
		sc.WithdrawToAccount(500);
		System.out.println("Name : "+sc.getName());
		System.out.println("Balance is:"+sc.CheckBalance());
	}

}
