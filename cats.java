import java.util.Scanner;
class cats{
	public static void main (String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("no.of queries : ");
		int q = in.nextInt();//බළලුන්ගේ පිහිටීම
		
		for(int i=0; i<q; i++){
			int x=in.nextInt();
			int y=in.nextInt();
			int z=in.nextInt();
			int p1=Math.abs(x-z);
			int p2=Math.abs(y-z);
		
		System.out.println();
		if(p1>p2){
			System.out.println("catB");
		}
		else if(p1<p2){
			System.out.println("catA");
		}
		else{
			System.out.println("mouse");
		}
		}
			

	}
}