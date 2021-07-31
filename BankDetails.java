public class BankDetails{
	public static void main(String[] args){
		BankAccount o1 = new BankAccount("Pravin", 1000);
		System.out.println(o1.deposit(1350));
		System.out.println(o1.getBalance());
		o1.withDraw(300);
		System.out.println(o1.getBalance());
		o1.withDraw(3000);
		//System.out.println(o1.owner);
	}
}