import java.util.Scanner;
class test{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your Birthday : ");
		int day = in.nextInt();
		int mounth = in.nextInt();
		int year = in.nextInt();
		
		if((year%4 == 0)&&(year%400 == 0)){
		    int age1 = (2021-year);
		    int age2 = (12-mounth);
			if(mounth==2){
				int age3 = (29-day);
			}
			else if((mounth==1) || (mounth==3) || (mounth==5) || (mounth==7) || (mounth==9) || (mounth==11)){
				int age3 = (31-day);
	            System.out.println("Your age =  year : "+age1+"  mounth : "+age2+"  day : "+age3);
			}
			else{
				int age3 = (30-day);
			}
		}
		else{
			int age1 = (2021-year);
			int age2 = (12-mounth);
			if(mounth==02){
				int age3 = (28-day);
			}
			else if((mounth==1) || (mounth==3) || (mounth==5) || (mounth==7) || (mounth==9) || (mounth==11)){
				int age3 = (31-day);
	            System.out.println("Your age =  year : "+age1+"  mounth : "+age2+"  day : "+age3);
			}
			else{
				int age3 = (30-day);
			    System.out.println("Your age =  year : "+age1+"  mounth : "+age2+"  day : "+age3);
			}
		}
	}
}