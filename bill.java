import java.util.Scanner;
class bill{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		System.out.print("k = ");
		int k = in.nextInt();
		System.out.println();
		
		System.out.println("bill = ");
		int bill[] = new int[n];
		for(int i=0; i<n; i++){
			bill[i] = in.nextInt();
		}
		System.out.println("bill = ");
		for(int i=0; i<n; i++){
			System.out.print(i +" , ");
		}
		System.out.println();
		System.out.print("bill charged = ");
		int charged = in.nextInt();
		System.out.println();
		
		int actual = 0;
		int sum = 0;
		for(int i=0; i<n; i++){
			if(bill[i]== bill[k]){
				continue;
			}
			sum = sum + bill[i];
		}
		actual= sum/2;
		if(actual==charged){
			System.out.println("Bon Appetit");
		}
		else{
			System.out.println(charged-actual);
		}
	}
}