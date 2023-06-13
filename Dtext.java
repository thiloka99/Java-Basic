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
		System.out.println("name : "+name);
		System.out.println("Student ID : "+id);
		System.out.println("Student address : "+address);
		System.out.println("phone number : "+pho_no);
	}
}
class Dtext{
	public static void main(String args[]){
		Student s1 = new Student("Nimal","N001","jaffna","03122254301");
		Student s2 = new Student("kamal","N002","colombo","03177589642");
		s1.print();
		System.out.println();
		s2.print();
	}
}
		