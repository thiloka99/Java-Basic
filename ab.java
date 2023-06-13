import java.util.Scanner;
class test{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Input an integer = ");
		int x = in.nextInt();
		String s = String.valueOf(x);
		int len = s.length();
		char c [] = new char[len];
		
		for(int i=0; i<len; i++){
			c[i] = s.charAt(i);
		}
		String s2[] = new String[len];
		for(int i=0; i<len; i++){
			s2[i] = Character.toString(c[i]);
		}
		int n[] = new int[len];
		for(int i=0; i<len; i++){
			n[i] = Integer.parseInt(s2[i]);
		}
		
		int sum = 0;
		for(int i=0; i<len; i++){
			sum = sum + n[i];
		}
		System.out.println(sum);
	}
}