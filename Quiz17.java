
public class Quiz17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int sequence =1;

		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				if(i>=j) {
					System.out.print(sequence +" ");
					sequence ++;
					
				}
			}
			System.out.println();
		}
	}

}
