import java.util.Scanner;
class test{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int A[] = new int [5];
		for(int i=0; i<A.length; i++){
			A[i] = in.nextInt();
		}
		System.out.println();
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+",");
		}
		int sum = 0;
		for(int i=0; i<A.length; i++){
			sum = sum + A[i];
		}
		System.out.println("Total = "+sum);
		
	}
}
		