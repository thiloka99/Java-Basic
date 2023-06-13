import java.util.Scanner;
class Account{
	private static double balance;
	
	Account(){
		balance = 0.0;
	}
	public static void Deposit(double amount){
		if(amount > 0){
			balance = balance + amount;
		}
		else{
			System.out.println("cannot deposit negative value");
		}
	}
	void widthdraw(double amount){
		if((amount >0)&&(balance>0)){
			balance = balance - amount;
		}
		else{
			System.out.println("Cannot deposit negative value");
		}
	}
	public static double getBalance(){
		return balance;
	}
}
class SavingAccount extends Account{
	private static double interest;
	
	SavingAccount(double interest){
		this.interest = interest;
	}
	public static void addinterest(double interest){
		double x = getBalance()*interest;
		Deposit(x);
	}
	public static double getTotalBalance(){
		double x = getBalance();
		return x;
	}

	public static void main(String args[]){
		SavingAccount a = new SavingAccount(0.02);
		a.Deposit(13000);
		a.addinterest(0.2);
		System.out.println(getBalance());
		
		a.widthdraw(1000);
		System.out.println(getBalance());
		
		a.widthdraw(-1000);
		System.out.println(getBalance());
	}
}