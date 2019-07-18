import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("type the first number");
		int firstnumber = scan.nextInt();
		
		System.out.println("type the second number");
		int secondnumber = scan.nextInt();
		scan.close();
		
		int sum = firstnumber + secondnumber;
		
		System.out.println("the sum is " + sum);
		

	}

}