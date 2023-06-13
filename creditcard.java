import java.util.Scanner;
class Creditcard{
	private String customer;
	private String bank;
	private String account;
	private int limit;
	protected double balance;
	
	Creditcard(String customer, String bank, String account, int limit, double balance){
		this.customer = customer;
		this.bank = bank;
		this.account = account;
		this.limit = limit;
		this.balance = balance;
	}
	Creditcard(String customer, String bank, String account, int limit){
		this.customer = customer;
		this.bank = bank;
		this.account = account;
		this.limit = limit;
		balance=0.0;
	}
	public void setCustomer(String customer){
		this.customer = customer;
	}
	public String getCustomer(){
		return customer;
	}
	public void setBank(String bank){
		this.bank = bank;
	}
	public String getBank(){
		return bank;
	}
	public void setAccount(String account){
		this.account = account;
	}
	public String getAccount(){
		return account;
	}
	public void setLimit(int limit){
		this.limit = limit;
	}
	public int getLimit(){
		return limit;
	}
	public double makePayment(double amount){
		balance = balance - amount;
		return balance;
	}
	double Totalbalance = 0;
	public void charge(double money){
		Totalbalance = balance + money;
		/*if(Totalbalance < limit){
			System.out.println("Total balance ="+Totalbalance);
		}*/
	}
	double newLimite = 0;
	public double updateLimit(double value){
		newLimite = limit + value;
		return newLimite;
	}
	public void printSummary(){
		System.out.println("Customer:"+customer+" Bank:"+bank+" Account:"+account+" Limit:"+limit+" Balance:"+balance);
		//System.out.println("New Balance :"+Totalbalance);
	}
}
class PredatoryCreditcard extends Creditcard{
	private double apr;
	
	PredatoryCreditcard(String customer,String bank,String account,int limit,double balance,double apr){
		super(customer,bank,account,limit,balance);
		this.apr = apr;
	}
	public void setApr(double apr){
		this.apr = apr;
	}
	public double getApr(){
		return apr;
	}
	public void charge(double money){
		if(balance > getLimit()){
			balance=balance-5;
		}
		System.out.println(balance);
	}
	double monthlyFactor;
	public double ProcessMonth(){
		monthlyFactor = Math.pow(1+apr,1.0/12);
		return monthlyFactor;
	}
	public void print(){
		System.out.println("Balance = "+(balance*monthlyFactor));
	}
}
class Main{
	public static void main(String args[]){
		Creditcard c = new Creditcard("Jhon","BOC","saving",1000,5000);
		c.makePayment(200);
		c.charge(600);
		c.updateLimit(500);
		c.printSummary();
	}
}
	