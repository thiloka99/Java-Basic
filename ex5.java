import java.util.Scanner;
class test{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Input the string ; ");
		String a = in.next();
		int len = a.length();
		char [] h = new char[len];
		int count = 0;
		
		for(int i=0; i<len; i++){
			h[i]=a.charAt(i);
		}
		for(int i=0; i<len; i++){
			if(h[i]=='a' || h[i]=='A' || h[i]=='e' || h[i]=='E' || h[i]=='i' || h[i]=='I'|| h[i]=='o' || h[i]=='O'|| h[i]=='u' || h[i]=='U'){
				count = count + 1;
			}
		}
		System.out.println(count);
	}
}