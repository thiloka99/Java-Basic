import java.util.Scanner;
class minmax{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("input Array :");
		int A[] = new int[5];
		for(int i=0; i<A.length; i++){
			A[i] = in.nextInt();
		}
		System.out.println();
		int temp=0;
		for(int i=0; i<A.length; i++){
			for(int j=i+1; j<A.length; j++){
				if(A[i]>A[j]){
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+",");
		}
		System.out.println();
		
		int max=0;
		for(int i=0; i<A.length; i++){
			if(A[i]==A[0]){
				continue;
			}
			max=max+A[i];
		}
		System.out.println("Max = "+max);
		System.out.println();
		
		int min=0;
		for(int i=0; i<A.length; i++){
			if(A[i]==A[A.length-1]){
				continue;
			}
			min=min+A[i];
		}
		System.out.println("Min = "+min);
	}
}