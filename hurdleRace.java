import java.util.Scanner;
class hurdleRace{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		System.out.println("num.of hurdles = ");
		int nofh = in.nextInt();
		System.out.println("maximum height = ");
		int maxH = in.nextInt();
		System.out.println();
		
		int [] height = new int [nofh];
		System.out.println("enter the value of height :");
		for(int i=0; i<nofh; i++){
			height[i] = in.nextInt();
		}
		System.out.println();
	
		int max=height[0];
		for(int i=1; i<nofh; i++){
			if(max < height[i]){
				max = height[i];
			}
		}
		//System.out.println(max);
		
		if(maxH < max){
			System.out.println(max-maxH);
		}
		else{
			System.out.println("0");
		}
	}
}