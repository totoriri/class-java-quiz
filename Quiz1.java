import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("type the number ");
		int number = scan.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("your number is even number");
		}else {
			System.out.println("your number is odd number");
		}
		

	}

}

