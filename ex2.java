import java.util.Scanner;
class test{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Input the String : ");
		String s = in.nextLine();
		int len = s.length();
	//	char [] A = new char [len];
	
		int count = 0;
		for(int i=0; i<len; i++){
			if(s.charAt(i) == ' ')
			count++;
		}
		System.out.println(count+1);
	}
}