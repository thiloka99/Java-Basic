import java.util.Scanner;
class test{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String [] movies = {"Matrix","Terminator","Titanic","Avatar"};
		String [] Reviewers = {"Reviewer_1","Reviewer_2","Reviewer_3","Reviewer_4","Reviewer_5"};
		int [][] Marks = {{90,70,85,80},{68,85,70,90},{87,82,68,78},{76,70,70,80},{93,75,75,90}};
		String [] maxReviwermovie = new String [5];
		
		for(int i=0; i<movies.length; i++){
			System.out.print("         "+movies[i]+"\t ");
		}
		System.out.println();
		for(int i=0; i<Marks.length; i++){
			System.out.print(Reviewers[i]+"\t");
			for(int j=0; j<4; j++){
				System.out.print("\t"+Marks[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<Marks.length; i++){
			int max_Marks = 0;
			for(int j=0; j<Marks[0].length; j++){
				if(Marks[i][j] > max_Marks){
					max_Marks = Marks[i][j];
				}
			}
			System.out.print(Reviewers[i]+" = "+max_Marks);
			System.out.println();
		}
		int max1 = 0;
		int x1 = 0;
		for(int i=0; i<Marks[0].length; i++){
			if(Marks[0][0] < Marks[0][i])
			max1 = Marks[0][i];
			else
			 max1 = Marks[0][0];
		    x1 = i;
		}
		maxReviwermovie[0] = movies[x1];
		int max2 = 0;
		int x2 = 0;
		for(int i=0; i<Marks[0].length; i++){
			if(Marks[1][0] < Marks[1][i])
			maxReviwermovie[1] = Marks[1][i];
			else
			 maxReviwermovie[1] = Marks[1][0];
			x2 = i;
		}
		maxReviwermovie[1] = movies[x2];
		int max3 = 0;
		int x3 = 0;
		for(int i=0; i<Marks[0].length; i++){
			if(Marks[2][0] < Marks[2][i])
			maxReviwermovie[2] = Marks[2][i];
			else
			 maxReviwermovie[2] = Marks[2][0];
		}
		maxReviwermovie[2] = movies[x3];
		int max4 = 0;
		int x4 =0;
		for(int i=0; i<Marks[0].length; i++){
			if(Marks[3][0] < Marks[3][i])
			maxReviwermovie[3] = Marks[3][i];
			else
			 maxReviwermovie[3] = Marks[3][0];
		}
		maxReviwermovie[3] = movies[x4];
		int max5 = 0;
		int x5 = 0;
		for(int i=0; i<Marks[0].length; i++){
			if(Marks[4][0] < Marks[4][i])
			maxReviwermovie[4] = Marks[4][i];
			else
			 maxReviwermovie[4] = Marks[4][0];
		}
		maxReviwermovie[4] = movies[x5];
		
		String ele1 = maxReviwermovie[0];
		String ele2 = " ";
		int point1 = 1;
		int point2 = 1;
		
		for(int i=0; i<maxReviwermovie.length; i++){
			if(ele1 == maxReviwermovie[i])
			      point1++;
				  
	}
}