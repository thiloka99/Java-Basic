class Triangle{
	double heigth1;
	double length;
	double heigth2;
	
	Triangle(){
		heigth1 = 0.0;
		heigth2 = 0.0;
		length = 0.0;
		
	}
	double area;
	double perimeter;
	public void print(double heigth1,double heigth2, double length){
		this.heigth1 = heigth1;
		this.heigth2 = heigth2;
		this.length = length;
		System.out.println("heigth1 :"+heigth1);
		System.out.println("heigth2 :"+heigth2);
		System.out.println("length :"+length);
	}
	public void printAre(){
		area = 0.5*length*heigth1;
		System.out.println("Area = "+area);
		System.out.println();
	}
	
	public void printperim(){
		perimeter = heigth1+heigth2+length;
		System.out.println("Perimeter = "+perimeter);
	}
}
class d2text{
	public static void main(String args[]){
		Triangle t1 = new Triangle();
		t1.print(4,3,5);
		t1.printAre();
		t1.printperim();
	}
}