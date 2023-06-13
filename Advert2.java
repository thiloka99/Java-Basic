import java.util.Scanner;
class Advert{
	protected int fee;
	Advert(){
		int fee = 0;
	}
	Advert(int fee){
		this.fee = fee;
	}
	public void setFee(int fee){
		this.fee = fee;
	}
	int getCost(){
		return fee;
	}
	void tostring(){
		System.out.println("Advert : fee ="+fee);
	}
}
class Hoarding extends Advert{
	private int rate;
	private int numDays;
	
	Hoarding(int fee, int rate, int numDays){
		super(fee);
		this.rate = rate;
		this.numDays = numDays;
	}
	void totring(){
		super.tostring();
		System.out.println("rate :"+rate+", Holidays :"+numDays);
	}
	int getCost(){
		int cost = super.getCost() + rate*numDays;
		return cost;
	}
}
class main{
	public static void main(String args[]){
		Hoarding h = new Hoarding(100, 5, 300);
		h.toString();
		System.out.println("Hoarding cost:"+h.getCost());
	}
}