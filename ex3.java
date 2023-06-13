import java.util.Scanner;
class test{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first num = ");
		int x1 = in.nextInt();
		System.out.print("Enter second num = ");
		int x2 = in.nextInt();
		System.out.print("Enter third num = ");
		int x3 = in.nextInt();
		System.out.print("Enter fourth num = ");
		int x4 = in.nextInt();
		
		if(x1 == x2 && x2 == x3 && x3 == x4){
			System.out.println("Numbers are equal!");
		}
		else{
			System.out.println("Numbers are not equal!");
		}
	}
}
		