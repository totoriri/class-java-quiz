
public class Quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 System.out.println("*");
//		 System.out.println("**");
//		 System.out.println("***");
//		 System.out.println("****");
//		 System.out.println("*****");
//		 
		 

	                
			int i, j;

			
			for(i=0; i<5; i++)
			{
				for(j=0; j<=i; j++)
				{

					System.out.print("*");
				}

//				これないと、段が別れずに一列になちゃう。
				System.out.println(); 
			}
	}
	}