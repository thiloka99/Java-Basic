import java.util.Scanner;
class palindrome{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Input the word :");
		String s = in.next();
		int len = s.length();
		
		boolean isPalindrome = false;
		for(int i=0; i<len/2; i++){
			if(s.charAt(i) != s.charAt(len-i-1)){
				isPalindrome = false;
			}
			else{
				isPalindrome = true;
			}
		}
		System.out.println("that word palindrom is :"+isPalindrome);
	}
}