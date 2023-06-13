class Employee{
	String first_Name;
	String last_Name;
	double salary;
	
	Employee(String first_Name, String last_Name, double salary){
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.salary = salary;
	}
	void setFirstName(String first_Name){
		this.first_Name = first_Name;
	}
	String getFirstName(){
		return first_Name;
	}
	void setLastName(String last_Name){
		this.last_Name = last_Name;
	}
	String getLastName(){
		return last_Name;
	}
	void setSalary(double salary){
		this.salary = salary;
	}
	double getSalary(){
		return salary;
	}
	void print(){
		if(salary <= 0){
			System.out.println(first_Name);
			System.out.println(last_Name);
			System.out.println("0.0");
		}
		else{
			System.out.println(first_Name);
			System.out.println(last_Name);
			System.out.println("Monthly Salary : "+salary);
			System.out.println("Yearly Salary : "+(12*salary));
			System.out.println("Raise Salary : "+((salary*10/100)+(12*salary)));
		}
		System.out.println();
	}
}
class EmployeeTest{
	public static void main(String args[]){
		Employee e1 = new Employee("kamal","fernamdo",20000);
		Employee e2 = new Employee("Amal","perera",75000);
		e1.print();
		e2.print();
	}
}