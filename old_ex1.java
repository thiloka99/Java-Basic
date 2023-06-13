import java.util.Scanner;
class Student{
	String name;
	String id;
	String address;
	String pho_no;
	
	Student(String name,String id,String address, String pho_no){
		this.name = name;
		this.id = id;
		this.address = address;
		this.pho_no = pho_no;	
	}
	public void print(){
		System.out.print("name : "+name);
		System.out.print("Student ID : "+id);
		System.out.print("Student address : "+address);
		System.out.print("phone number : "+pho_no);
	}
}
class text{
	public static void main(String args[]){
		Student s1 = new Student("Nimal","N001","jaffna","03122254301");
		Student s2 = new Student("kamal","N002","colombo","03177589642");
	}
}
		