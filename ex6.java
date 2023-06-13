import java.util.Scanner;
class test{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first input : ");
		String firstInput = in.next();
		int len1 = firstInput.length();
		System.out.print("Enter second input : ");
		String secondInput = in.next();
		int len2 = secondInput.length();
		boolean value = false;
		
		String firstInput1 = firstInput.toLowerCase(); 
		String secondInput2= secondInput.toLowerCase(); 
		
		char c1[] = new char[len1];
		char c2[] = new char[len2];
		
		for(int i=0; i<len1; i++){
			c1[i] = firstInput1.charAt(i);
		}
		for(int i=0; i<len2; i++){
			c2[i] = secondInput2.charAt(i);
		}
		for(int i=0; i<len1; i++){
			for(int j=0; j<len2; j++){
				if(c1[i] == c2[j]){
					c2[j] = ' ';
					value = true;
					break;
				}
				else{
					value = false;
				}
			}
		}
		if(value){
			System.out.println("Anagrams");
		}
		else{
			System.out.println("not Anagrams");
		}
	}
}
			
			