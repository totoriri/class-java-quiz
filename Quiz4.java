import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	 Scanner scan = new Scanner(System.in);
	 System.out.println("type a charactor!");
	 char ch = scan.next().charAt(0);
	 
	 switch(ch) {
	  case 'A':
		  System.out.println("this is Vowel in uppercase");
		  break;
	  case 'I':
		  System.out.println("this is Vowel in uppercase");
		  break;
	  case 'U':
		  System.out.println("this is Vowel in uppercase");
		  break;
	  case 'E':
		  System.out.println("this is Vowel in uppercase");
		  break;
	  case 'O':
		  System.out.println("this is Vowel in uppercase");
		  break;
		  
	 
	  case 'a':
		  System.out.println("this is Vowel in lowercase");
		  break;
	 
	  case 'i':
		  System.out.println("this is Vowel in lowercase");
		  break;
	
	  case 'u':
		  System.out.println("this is Vowel in lowercase");
		  break;
		  
	  case 'e':
		  System.out.println("this is Vowel in lowercase");
		  break;
		  
	  case 'o':
		  System.out.println("this is Vowel in lowercase");
		  break;
		  
	 default:
		  System.out.println("your charactor is constants of Non-alphabetic character !");
	  
	 
	}
}
}

