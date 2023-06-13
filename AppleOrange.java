import java.util.Scanner;
class Apple{
	public static void main (String args[]){
		Scanner in  = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		System.out.println("start Home:"+s);
		System.out.println("end Home:"+t);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("apple tree:"+a);
		System.out.println("orange tree:"+b);
		int m = in.nextInt(); //length
		int n = in.nextInt(); //length
		System.out.println("apple amount:"+m);
		System.out.println("orange amount:"+n);
		
		int apple[] = new int [m];
		int orange[] = new int [n];
		
		for(int i=0; i< m; i++){
			 apple[i] = in.nextInt();
		}
		for(int i=0; i< m; i++){
			System.out.print(apple[i]+","); // apple gedi watena dura apple tree eke idan
		}
	    System.out.println();
		for(int i=0; i< n; i++){
		    orange[i] = in.nextInt();
		}
		for(int i=0; i< n; i++){
			System.out.print(orange[i]+","); // orange gedi watena dura orange tree eke idan
		}
		
		int apple2[] = new int [m];
		int orange2[] = new int [n];
		
		for(int i=0; i< m; i++){
			apple2[i]=apple[i]+a;
		}
		for(int i=0; i< n; i++){
			orange2[i]=orange[i]+b;
		}
		System.out.println();
		System.out.print("apple distance from zero: ");
		for(int i=0; i<m; i++){
			System.out.print(apple2[i]+",");
		}
		System.out.println();
		System.out.print("orange distance from zero: ");
		for(int i=0; i<n; i++){
			System.out.print(orange2[i]+",");
		}
		System.out.println();
		int count1 = 0;
		for(int i=0; i<m; i++){
			if((apple2[i] >= 7) && (apple2[i]<=11)){
				count1++;
			}
		}
		System.out.println("no.of apples in the home = "+count1);
		int count2 = 0;
		for(int i=0; i<n; i++){
			if((orange2[i] >= 7) && (orange2[i]<=11)){
				count2++;
			}
		}
		System.out.println("no.of oranges in the home = "+count2);
	}
}