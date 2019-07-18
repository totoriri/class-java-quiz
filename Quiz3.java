import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("type the year ");
		int year = scan.nextInt();
		
		if(year % 4==0 && year % 100 != 0 || year % 400 ==0) {
			System.out.println("this year is leap year");
		}else {
			System.out.println("this year is not leap year");
		}
		

	}

}
