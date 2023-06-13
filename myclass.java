import java.util.Scanner;
class Book{
	private String bookName;
	private int ISBN_no;
	private String authorName;
	private double author_price;
	private static double discount;
	double newPrice;
	
	Book(String bookName, int ISBN_no, String authorName, double author_price){
		this.bookName = bookName;
		this.ISBN_no = ISBN_no;
		this.authorName = authorName;
		this.author_price = author_price;
	}
	void setName(String bookName){
		this.bookName = bookName;
	}
	String getName(){
		return bookName;
	}
	static void setDiscount(double discountRate){
		discount = discountRate;
	}
	double getDiscount(){
		return discount;
	}
	double finalPrice(){
		newPrice = author_price - discount*author_price;
		return newPrice;
	}
	String getnewInform(){
		return (bookName+","+ISBN_no+","+authorName+","+author_price);
	}
}

class BookStore{
	public static void main(String args[]){
		Book b1 = new Book("abcd",05,"fernando",1000);
		
		System.out.println(b1.getnewInform());
		b1.setDiscount(0.1);
		System.out.println("new discount = "+b1.getDiscount());
		System.out.println("new price = "+b1.finalPrice());
	}
}
		