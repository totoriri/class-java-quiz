import java.util.Scanner;

public class Quiz8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String text = "";
        String reversedText = "";
        
        //get the information from the screen
        System.out.println("Please, inform some word");
        text = scan.nextLine();
        scan.close();
        
        //reverse the string
        for(int i = text.length() - 1; i >= 0; i--)
            reversedText += text.charAt(i);
        
        //compare the reversed one with the original
        if(text.toLowerCase().equals(reversedText.toLowerCase()))
            System.out.printf("This is a Polindrome '%s'", reversedText);
        else
            System.out.print("This is not a Polindrome");
    }
}






