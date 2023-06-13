import java.util.Scanner;
class Employee{
	String name;
	int age;
	int jobBand;
	double salary;
	
	Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void setName(String name){
		this.name = name;
	}
	String getName(){
		return name;
	}
	void setAge(int age){
		this.age =age;
	}
	int getAge(){
		return age;
	}
	void setJobBand(int jobBand){
		this.jobBand = jobBand;
	}
	int getJobBand(){
		return jobBand;
	}
	void setSalary(double salary){
		this.salary = salary;
	}
	double getSalary(){
		return salary;
	}
	void print(){
		System.out.println("Name : "+name+", Age :"+age+", Salary :"+salary);
	}
	double employeeBouns = 0;
	double EmployeeBouns(){
		if(jobBand <= 2 ){
			employeeBouns = 0.10;
		}
		else{
			employeeBouns = 0.15;
		}
		return employeeBouns;
	}
	double totalSalary = 0;
	double TotalSalary(){
		totalSalary = salary + salary*employeeBouns;
		return totalSalary;
	}
	void printSalary(){
		System.out.println("Total salary = "+totalSalary);
	}
}
class employeeDemo{
	public static void main(String args[]){
		Employee e = new Employee("Jhon", 30);
		e.setJobBand(1);
		e.setSalary(200000);
		e.print();
		e.EmployeeBouns();
		e.TotalSalary();
		e.printSalary();
	}
}
	