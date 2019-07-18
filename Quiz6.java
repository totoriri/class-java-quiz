import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	 Scanner scan1 = new Scanner(System.in);
	 System.out.println("type a charactor!");
	 String ch = scan1.nextLine();
	 
	 System.out.println("type a string");
	 Scanner scan2 = new Scanner(System.in);
	 String st = scan2.nextLine();
	 
	
	 
	 if(st.contains(ch))
	 {
		 System.out.println("this string contains a charactor you typed.");
	 }else {
		 System.out.println("it dosen't contain a charactor you typed.");
	 }
	 
	 
	}
	
}

