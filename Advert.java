class Advert{
	protected int fee;
	Advert(){
		fee = 0;
	}
	Advert(int fee){
		this.fee = fee;
	}
	void setFee(int fee){
		this.fee = fee;
	}
	int getCost(){
		return fee;
	}
	void tostring(){
		System.out.println( "Advert: Fee =" + fee);
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
	void tostring(){
		super.tostring();
		System.out.println("rate = "+rate+" HoliDays = "+numDays);
	}
	int getCost(){
		int cost = super.getCost() + rate*numDays;
		return cost;
	}
}

class Test{
	public static void main(String args[]){
		Advert A1 = new Advert(200);
		A1.tostring();
		System.out.println("Adv cost: "+ A1.getCost());
		System.out.println();
		
		Hoarding h1 = new Hoarding(100,300,5);
		h1.tostring();
		System.out.println("Hoarding cost :"+h1.getCost());
	}
}