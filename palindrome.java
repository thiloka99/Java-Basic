import java.util.Scanner;
class test
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		int A [][] = new int [6][5];
	
	    for(int i=0; i<A.length; i++){
			for(int j=0; j<A[0].length; j++){
				A [i][j] = in.nextInt();
			}
		}
		System.out.println("_________________________________");
		
		for(int i=0; i<A.length; i++){
			for(int j=0; j<A[0].length; j++){
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
		