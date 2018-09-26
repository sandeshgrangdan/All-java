package Accounts;

public class Account {
	private String name;
	private double amount;
	public Account() {
		this.name="";
		this.amount=0.0;
	}
	public Account(String name, double amount) {
	
		this.name = name;
		this.amount = amount;
	}
	public void deposit(double amount){
		this.amount+=amount;
	}
	public String getName() {
		return name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	
}
