import java.util.Scanner;
class student{
	String name;
	String regno;
	double [] marks;
	
	student(String name, String regno){
		this.name = name;
		this.regno = regno;
		marks = new double[3];
	}
	void readMarks(){
		Scanner in = new Scanner(System.in);
		for(int i=0; i<marks.length; i++){
			System.out.print("Enter the marks :");
			marks[i] = in.nextDouble();
		}
		System.out.println();
	}
	double getAvg(){
		double avg = 0;
		for(int i=0; i<marks.length; i++){
			avg = avg +marks[i];
		}
		avg = avg/marks.length;
		return avg;
	}
	void print(){
		System.out.println(name+":"+regno+":"+getAvg());
	}
}
class main{
	static void findBatchtop(student [] su_dent){
		int topindex = 0;
		double avgMarks = su_dent[0].getAvg();
		for(int i=0; i<su_dent.length; i++){
			if(avgMarks < su_dent[i].getAvg()){
				topindex = i;
			}
		}
		System.out.println("the batch top is:"+su_dent[topindex].name);
	}
	public static void main(String args[]){
		student [] su_dent = new student[3];
		
		Scanner in = new Scanner(System.in);
		for(int i=0; i<su_dent.length; i++){
			System.out.println("name :");
			String name = in.next();
			System.out.println("Reg no :");
			String regno = in.next();
		
		su_dent [i] = new student(name,regno);
		su_dent [i].readMarks();
		}
		System.out.println();
		
		for(int i=0; i<su_dent.length; i++){
			su_dent[i].print();
		}
		findBatchtop(su_dent);
	}
}
		
		