import java.util.Scanner;
class test{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
	    int A[][] = {{2,2,3,4,5},{1,2,3,4,5},{5,4,6,7,8}};
	
	    for(int i=0; i<A.length; i++){
		    for(int j=0; j<A[i].length; j++){
			    System.out.print(A[i][j]+"\t");
		    }
			System.out.println();
	    }
		System.out.println();
		System.out.print("Enter the element = ");
		int x = in.nextInt();
		int count = 0;
		
		
		for(int i=0; i<A.length; i++){
			for(int j=0; j<A[i].length; j++){
				if(x == A[i][j]){
					count++;
				}
			}
		}
		System.out.println(count);
		for(int i=0; i<A.length; i++){
			int sum = 0;
			for(int j=0; j<A[i].length; j++){
				sum = sum + A[i][j];
			}
			System.out.println("Sum = "+sum);
		}
		System.out.println();
		for(int j=0; j<A[0].length; j++){
			int sum2 = 0;
			for(int i=0; i<A.length; i++){
				sum2 = sum2 + A[i][j];
			}
			System.out.println(sum2);
		}

	}
}



	