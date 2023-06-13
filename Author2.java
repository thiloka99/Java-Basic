import java.util.Scanner;
class Author{
	private String name;
	private String email;
	private char gender;
	
	Author(String name,String email,char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
	public char getGender(){
		return gender;
	}
	public String toString(){
		return "Author[name="+name+", Email ="+email+" , Gender ="+gender+"]";
	}
}
class Book{
	String name;
	Author author;
	double price;
	int quantity;
	
	Book(String name, Author author, double price){
		this.name = name;
		this.author = author;
		this.price = price;
	}
	Book(String name, Author author, double price, int qty){
		this.name = name;
		this.author = author;
		this.price = price;
		quantity = qty;
	}
	public String getName(){
		return name;
	}
	public Author getAuthor(){
		return author;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
	public void setQty(int qty){
		quantity = qty;
	}
	public int getQty(){
		return quantity;
	}
	public String toString(){
		return "["+author.toString()+"], Price="+price+", Qty="+quantity+"]";
	}
}
class Main{
	public static void main(String args[]){
		Author Jhon = new Author("Jhon","jhon123@gmail.com", 'M');
		System.out.println(Jhon);
		
		Book b = new Book("Java",Jhon,1500,5);
		System.out.println(b);
	}
}
		
	