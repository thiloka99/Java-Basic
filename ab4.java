import java.util.Scanner;
class test{
	public static void main(String args[]){
		Scanner in  = new Scanner(System.in);
		
		do{
		System.out.println("firstNum = ");
		double x = in.nextDouble();
		System.out.println("secondNum = ");
		double y = in.nextDouble();
		System.out.println("Enter operater = ");
		String z = in.next();
	
		    switch (z){
			   case "+" : System.out.print(x+y); break;
			   case "-" : System.out.print(x-y); break;
			   case "*" : System.out.print(x*y); break;
			   case "/" : System.out.print(x/y); break;
			   default : System.out.print("The operator is not found "); 
			}
			
		    System.out.println("If you want to continue enter \'yes\'");
		    String test = in.next();
		    if(!test.equals("yes")) break;

		}while(true);
	}
}

class GCD{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("First num = ");
		int x = in.nextInt();
		System.out.print("second num = ");
		int y = in.nextInt();
		
		int min = x;
		int gcd = 0;
		if(x<y)
			min = x;
		else
			min = y;
		for(int i=2; i<=min; i++){
			if((x%i==0)&&(y%i==0)){
				gcd = i;
			}
		}
		System.out.println("GCD = "+gcd);
	}
}

class Palindrom{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Word = ");
		String s = in.next();
		int len = s.length();
		boolean value = true;
		
		for(int i=0; i<len/2; i++){
			if(s.charAt(i)!=s.charAt(len-1-i)){
				value = false;
			}
		}
		System.out.println("It is palindrom  : "+value);
	}
}

class odd{
	public static void main(String args[]){
		for(int i=0; i<=20; i++){
			if(i%2 == 0)
			     continue;
		    System.out.print(i+",");
		}
	}
}

class space{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the world = ");
		String s1 = in.nextLine();
		int len = s1.length();
		String s2 = " ";
		
		for(int i=0; i<len; i++){
			if(s1.charAt(i)==' ')
			   continue;
			s2 = s2+s1.charAt(i);
		}
		System.out.print(s2);
	}
}
class x{
	public static void main(String args[]){
		for(int i=1; i<=3; i++){
			for(int j=0; j<1; j++){
				System.out.println("i = "+i+","+"j = "+j);
			}
		}
	}
}

class Array{
	public static void main(String args[]){
		int A [] = {10,20,30,40,50,60};
		
		System.out.print("[ ");
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+",");
		}
		System.out.print("\b]");
	}
}

class Array1{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int A[] = new int[5];
		int temp = 0;
		
		for(int i=0; i<A.length; i++){
			System.out.println("Enter the element = ");
			 A[i] = in.nextInt();
		}
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+",");
		}
		for(int i=0; i<A.length; i++){
			for(int j=0; j<A.length; j++){
		       if(A[i]<A[j]){
			     temp = A[j];
			     A[j] = A[i];
			     A[i] = temp;
			   }
			}
		}
		System.out.println();
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+",");
		}
	}
}

class Array2{
	public static void main(String args[]){
		int A[] = {2,3,4,5,6,7,8,9};
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+",");
		}
		System.out.println();
		System.out.print("Enter the location = ");
		int location = in.nextInt();
		System.out.print("Enter the value = ");
		int value = in.nextInt();
		
	    A[location-1] = value;
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+",");
		}
	}
}

class Array3{
	public static void main(String args[]){
		int A[] = {1,2,3,4,5,6,7,8,9,10};
		Scanner in = new Scanner(System.in);
		System.out.print("inster the 1st location : ");
		int firstLocation = in.nextInt();
		System.out.print("inster the 2st location : ");
		int secondLocation = in.nextInt();
		
		int store = A[secondLocation-1];
		A[secondLocation-1] = A[firstLocation-1];
		A[firstLocation-1] = store;
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+",");
		}
	}
}
class Array2D{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int A[][] = new int [3][4];
		int B[][] = new int [3][4];
		int C[][] = new int [3][4];
		
		for(int i=0; i<A.length; i++){
			for(int j=0; j<A[0].length; j++){
				A[i][j] = in.nextInt();
			}
		}
		System.out.println();
		for(int i=0; i<B.length; i++){
			for(int j=0; j<B[0].length; j++){
				B[i][j] = in.nextInt();
			}
		}
		System.out.println();
		for(int i=0; i<A.length; i++){
			for(int j=0; j<A[0].length; j++){
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("_____________________________________");
		for(int i=0; i<B.length; i++){
			for(int j=0; j<B[0].length; j++){
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0; i<A.length; i++){
			for(int j=0; j<A[0].length; j++){
				C[i][j] = A[i][j] + B[i][j];
			}
			System.out.println();
		}
		for(int i=0; i<A.length; i++){
			for(int j=0; j<A[0].length; j++){
				System.out.print(C[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
		
	
		