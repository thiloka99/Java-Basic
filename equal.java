import java.util.Scanner;
class test{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("input the first word :");
		String s1 = in.next();
		System.out.println("input the second word :");
		String s2 = in.next();
		
		if(s1.equals(s2)){
			System.out.println("both are same");
		}
		else{
			System.out.println("both are not same");
		}
	}
}