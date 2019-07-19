import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the factorial you want to know.");
      int number = scan.nextInt();
      
      int Factrial = 1;
      
      for(int i=1;i<=number;i++) {

    	 Factrial = Factrial * i;
    	  
      }
      
      System.out.println(Factrial);
      
      
      
	}

}


//そもそも会場ってなんだっけ？？
//５なら%5!=5*4*3*2*1て感じ
//N!=N*(n-1)*(n-2)・・・・３＊２＊１みたいな
//これって、nから一ずつ数引いてく作業みたいなもんだよね。


//for文のスコープ？？initializeをforの中でしようとしたら、エラー出たのはスコープのせい？？へ？
