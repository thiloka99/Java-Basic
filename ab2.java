class test{
	public static void main(String args[]){
		for(int i=0; i<8; i++){
			for(int j=0; j<=i; j++){
				System.out.print("+");
			}
			System.out.println();
		}
	}
}

class test1{
	public static void main(String args[]){
		for(int i=1; i<=7; i++){
			for(int j=1; j<=7-i; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1); j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class test2{
	public static void main(String args[]){
		for(int i=1; i<=9; i++){
			for(int j=1; j<=i-1; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=(9-(2*i)); j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class test3{
	public static void main(String args[]){
		for(int i=0; i<8; i++){
			for(int j=0; j<8-i; j++){
				System.out.print("^");
			}
			System.out.println();
		}
	}
}