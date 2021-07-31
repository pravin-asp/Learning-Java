public class BankAccount{
	private String owner;
	private double balance;
	
	BankAccount(String owner, double balance){
		this.owner = owner;
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double deposit(double amount){
		balance += amount;
		return balance;	
	}
	
	public void withDraw(int amount){
		if(amount < balance){
			balance -= amount;
			System.out.println("Balance available is Rs." + balance);
		}
		else{
			System.out.println("No sufficient balance available. Your balance is Rs." + balance);
		}
	}
}