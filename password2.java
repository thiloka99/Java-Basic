import java.util.Scanner;
class password{
	static final int PASSWORD_LENGTH =8;
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your password = ");
		String s = in.nextLine();
		
		if(is_valid_password(s)){
			System.out.println("Password is valid = "+s);
		}
		else{
			System.out.println("Password is not valid = "+s);
		}
	}
	static boolean is_letter(char h){
		h = Character.toUpperCase(h);
		return (h >= 'A' &&  h<= 'Z');
	}
	static boolean is_Numeric(char h){
		return (h >= '0' && h <= '9');
	}
	static boolean is_valid_password(String password){
		if(password.length() < PASSWORD_LENGTH){
			return false;
		}
		int numcount = 0;
		int lettercount = 0;
		for(int i=0; i<password.length(); i++){
			char h = password.charAt(i);
			
			if(is_Numeric(h))
			   numcount++;
			else if(is_letter(h)){
				lettercount++;
			}
			else{
				return false;
			}
		}
		return (numcount >= 2);
	}
}