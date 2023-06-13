class Book{
	private String name;
	private int numISBN;
	private String authorName;
	private double price;
	private static double discount;
	double Newprice;
	
	Book(String name, int numISBN, String authorName, double price){
		this.name = name;
		this.numISBN = numISBN;
		this.authorName = authorName;
		this.price = price;
	}
	void setName(String name){
		this.name = name;
	}
	String getName(){
		return name;
	}
	static void setNewdiscount(double discountRate){
		discount = discountRate;
	}
	double getNewdiscount(){
		return discount;
	}
	double Finalprice(){
		Newprice = price - (price*discount);
		return Newprice;
	}
	String getBookInfo(){
		String info = (name+" , "+numISBN+" , "+authorName+" , "+price);
		return info;
	}
}
class BookStore{
	public static void main(String args[]){
		Book b1 = new Book("Java_Basic",1001,"Mr.silva",1000);
		Book b2 = new Book("Python_Basic",1018,"Mrs.perera",1500);
	
		System.out.println(b1.getBookInfo());
		System.out.println(b2.getBookInfo());
		System.out.println();
			
		Book.setNewdiscount(0.1);
		System.out.println("New discount 1 = "+b1.getNewdiscount());
		System.out.println("New Price "+b1.getName()+" is = "+b1.Finalprice());
		System.out.println("New Price "+b2.getName()+" is = "+b2.Finalprice());
		
		System.out.println();
		Book.setNewdiscount(0.2);
		System.out.println("New discount 2 = "+b1.getNewdiscount());
		System.out.println("New Price "+b1.getName()+" is = "+b1.Finalprice());
		System.out.println("New Price "+b2.getName()+" is = "+b2.Finalprice());
		
	}

	

}
		
	