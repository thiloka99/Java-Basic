import java.util.Scanner;
class employee{
	private String name;
	private int age;
	private int jobBand;
	private double salary;
	private static int employeeCount=0;
	double emploBonus;
	
	employee(String name, int age){
		employeeCount++;
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setJobBand(int jobBand){
		this.jobBand = jobBand;
	}
	public int getJobBand(){
		return jobBand;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	public int getEmployeeCount(){
		return employeeCount;
	}
	public void print(){
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("JobBand :"+jobBand);
		System.out.println("Salary :"+salary);
	}
	public double emploBonus(){
		if(jobBand < 8){
			emploBonus = 0.10;
		}
		else{
			emploBonus = 0.15;
		}
		return emploBonus;
	}
	double totalSalary = 0;
	public double employeeTotalSalary(){
		totalSalary = salary+(salary*emploBonus);
		return totalSalary;
	}
	public void printTotalSalary(){
		System.out.println("Total Salary ="+totalSalary);
	}
}
class SoftwareEngineer extends employee{
	private boolean hasLaptop;
	private boolean isSupportTeamMember;
	
	SoftwareEngineer(String name, int age){
		super(name,age);
	}
	
	public void setHaslaptop(boolean hasLaptop){
		this.hasLaptop = hasLaptop;
	}
	public boolean getHaslaptop(){
		return hasLaptop;
	}
	public void setIsSupportTeamMember(boolean isSupportTeamMember){
		this.isSupportTeamMember = isSupportTeamMember;
	}
	public boolean SoftwareEngineer(){
		return isSupportTeamMember;
	}
	public double emploBonus(){
		if(isSupportTeamMember) {
			emploBonus = 0.15;
		}
		else{
			emploBonus = 0.10;
		}
		return emploBonus;
	}
	double totalSalary = 0;
	public double employeeTotalSalary(){
		totalSalary = getSalary()+(getSalary()*emploBonus);
		return totalSalary;
	}
	public void printTotalSalary(){
		System.out.println("Total Salary ="+totalSalary);
	}
}
	
	
class EmployeeMain{
	public static void main(String args[]){
		employee employee_1 = new employee("Jhon",30);
		
		employee_1.setJobBand(8);
		employee_1.setSalary(200000);
		employee_1.print();
		
		employee_1.emploBonus();
		employee_1.employeeTotalSalary();
		employee_1.printTotalSalary();
		System.out.println("Employee count = "+employee_1.getEmployeeCount());
		System.out.println();
		
		employee employee_2 = new employee("Sara",27);
		employee_2.setJobBand(7);
		employee_2.setSalary(158000);
		employee_2.print();
		
		employee_2.emploBonus();
		employee_2.employeeTotalSalary();
		employee_2.printTotalSalary();
		System.out.println("Employee count = "+employee_2.getEmployeeCount());
		System.out.println();
		
		SoftwareEngineer s1 = new SoftwareEngineer("Sara" ,27);
		s1.setJobBand(7);
		s1.setSalary(158000);
		s1.setIsSupportTeamMember(true);
		s1.print();
		s1.emploBonus();
		s1.employeeTotalSalary();
		s1.printTotalSalary();
		
	}
}
		
	
	