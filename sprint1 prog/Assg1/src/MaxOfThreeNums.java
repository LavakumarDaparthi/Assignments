import java.util.Scanner;

public class MaxOfThreeNums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		
		if(p>r && p>t) {
			System.out.println(p);
		}else if(r>p && r>t) {
			System.out.println(r);
		}else {
			System.out.println(t);
		}
		
		sc.close();
	}
	
}
