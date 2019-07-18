import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("type the first decimal ");
		double firstnumber = scan.nextDouble();
		
		System.out.println("type the second decimal");
		double secondnumber = scan.nextDouble();
		scan.close();
		
		double sum = firstnumber + secondnumber;
		
		System.out.println("the sum is " + sum);
		

	}

}

