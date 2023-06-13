import java.util.Scanner;
class test{
	public static void main (String args[]){
		Scanner in = new Scanner(System.in);
		String Movies [] = {"Matrix","Termi","Titanic","Avatar"};
		String Reviewers [] = {"Reviewer1","Reviewer2","Reviewer3","Reviewer4"};
		int bestMovie [][] = new int [5][4];
		String maxReviewers[] = new String[5];

	    for(int i=0; i<bestMovie.length; i++){
			for(int j=0; j<bestMovie[0].length; j++){
				
				System.out.print(Reviewers[i]+" for "+Movies[j]+ " :- ");
				bestMovie [i][j] = in.nextInt();
			}
		}
		System.out.println("_________________________________________");
		
		for(int i=0; i<bestMovie.length; i++){
			for(int j=0; j<bestMovie[0].length; j++){
				System.out.print(bestMovie[i][j]+" \t    ");
			}
			System.out.println();
		}
		int max1 = 0;
		int count1 = 0;
		int x1 =0;
		for(int i=0; i<bestMovie[0].length; i++){	
		    if(bestMovie[0][0] < bestMovie[0][i]){
				count1++;
				max1 = bestMovie[0][i];
			    x1=i;
			}
		}
		maxReviewers [0] = Movies[x1];
		int max2 = 0;
		int count2 = 0;
		int x2 =0;
		for(int i=0; i<bestMovie[1].length; i++){	
		    if(bestMovie[1][0] > bestMovie[1][i]){
				count1++;
				max2 = bestMovie[1][i];
				x2=i;
			}
		}
		maxReviewers [1] = Movies[x2];
		int max3 = 0;
		int count3 = 0;
		int x3 =0;
		for(int i=0; i<bestMovie[2].length; i++){	
		    if(bestMovie[2][0] > bestMovie[2][i]){
				count3++;
				max3 = bestMovie[2][i];
			    x3=i;
			}
		}
		maxReviewers [2] = Movies[x3];
		int max4 = 0;
		int count4 = 0;
		int x4 =0;
		for(int i=0; i<bestMovie[3].length; i++){	
		    if(bestMovie[3][0] > bestMovie[3][i]){
				count4++;
				max4 = bestMovie[3][i];
			    x4=i;
			}
		}
		maxReviewers [3] = Movies[x4];
		int max5 = 0;
		int count5 = 0;
		int x5 =0;
		for(int i=0; i<bestMovie[4].length; i++){	
		    if(bestMovie[4][0] > bestMovie[4][i]){
				count5++;
				max5 = bestMovie[4][i];
			    x5=i;
			}
		}
		maxReviewers [4] = Movies[x5];
		for(int i=0; i<maxReviewers.length; i++){
			System.out.print(maxReviewers[i]);
		}
		String ele1 = maxReviewers[0];
		String ele2 = " ";
		int point1 = 1;
		int point2 = 1;
		
		for(int i=1; i<maxReviewers.length; i++){
			if(ele1 == maxReviewers[i]){
				point1++;
			}
			else{
				ele2 = maxReviewers[i];
				for(int j=2; j<maxReviewers.length-i;j++) 
				{
					if(ele2 == maxReviewers[j]) 
					{
						point2++;
					}
				}
			}
		}
		System.out.println("\t The matrix\t Terminator 2\t Titanic\t Avatar");
		System.out.println(Reviewers[0]+"\t"+bestMovie[0][0]+"\t"+bestMovie[0][1]+"\t"+bestMovie[0][2]);
		System.out.println(Reviewers[1]+"\t"+bestMovie[1][0]+"\t"+bestMovie[1][1]+"\t"+bestMovie[1][2]);
		System.out.println(Reviewers[2]+"\t"+bestMovie[2][0]+"\t"+bestMovie[2][1]+"\t"+bestMovie[2][2]);
		System.out.println(Reviewers[3]+"\t"+bestMovie[3][0]+"\t"+bestMovie[3][1]+"\t"+bestMovie[3][2]);
		System.out.println(Reviewers[4]+"\t"+bestMovie[4][0]+"\t"+bestMovie[4][1]+"\t"+bestMovie[4][2]);
		System.out.println();
		
		System.out.println(ele1+"="+point1+"point");
		System.out.println(ele2+"="+point2+"point");
			
		if(point1>point2) 
		{
			System.out.println(ele1+" is selected as the Best Movie of the year!!!");
		}
		else 
		{
			System.out.println(ele2+" is selected as the Best Movie of the year!!!");
		}
		
	}
}
		