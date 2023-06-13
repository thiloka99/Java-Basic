class Employee{
	private String name;
	private int age;
	private int jobBand;                ///Atributes 
	private double salary;
	private static int employeeCount = 0;
	double employeeBouns;
	
	Employee(String name, int age){
		employeeCount++;
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setJobBand(int jobBand){
		this.jobBand = jobBand;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getJobBand(){
		return jobBand;
	}
	public double getSalary(){
		return salary;
	}
	public int getemployeeCount(){
		return employeeCount;
	}
	public void print(){
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("JobBand = "+jobBand);
		System.out.println("Salary = "+salary);
	}
	double totalSalary = 0;
	public double EmployeeBonus(){
		if(jobBand < 8 ){
			employeeBouns = 0.10;
		}
		else{
			employeeBouns = 0.15;
		}
		return employeeBouns;
	}
	
	public double EmployeeTotalSalary(){
		totalSalary = salary +(salary*employeeBouns);
		return totalSalary;
	}
	public void PrintTotalSalary(){
		System.out.println("Total Salary = "+totalSalary);
	}
}
class SoftwareEngineer extends Employee{
	private boolean hasLaptop;
	private boolean isSupportMember;
	
	SoftwareEngineer(String name, int age){
		super(name,age);
	}
	public void setHasLaptop(boolean hasLaptop){
		this.hasLaptop = hasLaptop;
	}
	public void setSupportMember(boolean isSupportMember){
		this.isSupportMember = isSupportMember;
	}
	public boolean getHasLaptop(){
		return hasLaptop;
	}
	public boolean getSupportMember(){
		return isSupportMember;
	}
	public double EmployeeBonus(){
		if(isSupportMember){
			employeeBouns = 0.15;
		}
		else{
			employeeBouns = 0.10;
		}
		return employeeBouns;
	}
	double totalSalary = 0;
	public double EmployeeTotalSalary(){
		totalSalary = getSalary() + (getSalary()*employeeBouns);
		return totalSalary;
	}
	public void PrintTotalSalary(){
		System.out.println("Total Salary = "+totalSalary);
	}
}
	
class EmployeeMain{
	public static void main(String args[]){
		Employee e1 = new Employee("john",30);
		e1.setJobBand(8);
		e1.setSalary(200000);
		e1.print();
		e1.EmployeeBonus();
		e1.EmployeeTotalSalary();
		e1.PrintTotalSalary();
		System.out.println(e1.getemployeeCount());
		System.out.println();
		
		
		SoftwareEngineer s2 = new SoftwareEngineer("Sara",27);
		//s2.setJobBand(7);
		s2.setSalary(158000);
		s2.setSupportMember(true);
		s2.print();
		s2.EmployeeBonus();
		s2.EmployeeTotalSalary();
		s2.PrintTotalSalary();
		System.out.println(s2.getemployeeCount());
	}
}
	
