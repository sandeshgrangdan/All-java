package Accounts;

public class CheckingAccounts extends Account{

	public CheckingAccounts(String name, double amount) {
		super(name, amount);
	}
	public void withdraw(double amount){
		if(amount>=this.getAmount())
		this.setAmount(this.getAmount()-amount);
		else
			System.out.println("Insufficient balance");
	}
	
}
