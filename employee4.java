import java.util.Scanner;
class employee{
	String name;
	int age;
	double salary;
	
	public void printData(){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
	}
}
class programmer extends employee{
	String language;
	public void printData(){
		printData();
		System.out.println("Language :"+language);
	}
}
class DatabasePro extends employee{
	String databaseTool;
	public void printData(){
		printData();
		System.out.println("Database Tool :"+databaseTool);
	}
}
class Main{
	public static void main(String args[]){
		employee e = new employee();
		e.name = "ddddddd";
		e.age = 23;
		e.salary = 2000000;
	}
}