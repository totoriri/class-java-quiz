import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	 
	 Scanner string =new Scanner(System.in);
	 System.out.println("type a string");
	 String someString = string.nextLine();
	 
     System.out.println("Type a character");
     char someChar = string.next().charAt(0);

	 int count = 0;

	 for (int i = 0; i < someString.length(); i++) {
	     if (someString.charAt(i) == someChar) {
	         count++;
	     }
	 }
	
	 System.out.println(count);
	 
	 
	}

}
