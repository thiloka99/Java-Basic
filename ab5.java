import java.util.Scanner;
class method1{
	static int sam(int a){
		return a*a;
	}
	public static void main(String args[]){
		for(int i=1; i<5; i++){
			int b = sam(i);
			System.out.println(i+" is "+b);
		}
	}
}
class method2{
	//static int x = 0;
	static void update(int x){
		x = x+10;
	}
	public static void main(String args[]){
		int z = 50;
		System.out.println(z);
		update(z);
		System.out.println(z);
	}
}
class passbyValue{
	static void getTotal(int a, int b){
		int x = a+b;
		System.out.println(x);
	}
	public static void main(String args[]){
		int a=5 , b = 2;
		getTotal(a,b);

	}
}
class method3{
	static boolean isEven(int a){
		if(a%2==0)
		   return true;
		else
		   return false;
	}
	public static void main(String args[]){
		int a =10;
		boolean value = isEven(a);
		
		if(isEven(a))
		    System.out.println("even number");
		else 
		    System.out.println("odd number");
	}
}

class Vowel{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String s = in.nextLine();
		int len = s.length();
		int count = 0;
		
		for(int i=0; i<len; i++){
			if(isVowel(s.charAt(i))){
				count++;
			}
		}
		System.out.println(count);
	}
	static boolean isVowel(char a){
		switch(a){
			case 'a' :
			case 'A' :
			case 'e' :
			case 'E' :
			case 'i' :
			case 'I' :
			case 'o' :
			case 'O' :
			case 'u' :
			case 'U' : return true;
			
			default : return false;
		}
	}
}
class Box{
	String name;
	double width;
	double height;
	double depth;
	
	void printDetail(){
		System.out.println("   Width = "+width+" height = "+height+" depth = "+depth);
		printVol();
	}
	void printVol(){
		System.out.println("Vol = "+(width*height*depth));
	}
}
class BoxDem{
	public static void main(String args[]){
		Box a = new Box();
		a.name = "Box 1";
		a.width = 5;
		a.height = 2;
		a.depth = 3;
		System.out.print(a.name);
		a.printDetail();
	}
}
	