class Triangle{
	double heigth1;
	double heigth2;
	double length;
	
    Triangle(double heigth1,double heigth2,double length){
		this.heigth1 = heigth1;
		this.heigth2 = heigth2;
		this.length = length;
	}
	public void print(){
		System.out.println("heigth1 : "+heigth1);
		System.out.println("heigth2 : "+heigth2);
		System.out.println("length : "+length);
		System.out.println();
	}
	double area;
	double perimeter;
	public void printArea(){
		area = 0.5*length*heigth1;
		System.out.println("Area = "+area);
	}
	public void printperim(){
		perimeter = heigth1+heigth2+length;
		System.out.println("Perimeter = "+perimeter);
	}
}
class d3text{
	public static void main(String args []){
		Triangle t1 = new Triangle(4,3,5);
		t1.print();
		t1.printArea();
		t1.printperim();
	}
}