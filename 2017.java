import java.util.Scanner;
class Movies{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int marks[][] = new int [5][4];
		for(int i=0; i<marks.length; i++){
			for(int j=0; j<marks[i].length; j++){
				marks[i][j] = in.nextInt();
			}
		}
		System.out.println();
		String Movies [] = {"The Matrix","Terminator2","Titanic","Avatar"};
		for(int i=0; i<Movies.length; i++){
			System.out.print(Movies[i]+" \t ");
		}
		System.out.println();
		for(int i=0; i<marks.length; i++){
			for(int j=0; j<marks[i].length; j++){
				System.out.print(marks[i][j]+"\t\t");
			}
			System.out.println();
		}
		
	}
}