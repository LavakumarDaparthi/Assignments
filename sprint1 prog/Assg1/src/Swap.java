import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int r=sc.nextInt();
		
//		int help=p;
//		p=r;
//		r=help;
//		System.out.println(p+" "+r);
		
		p=p+r;
		r=p-r;
		p=p-r;
		System.out.println(p+" "+r);
		sc.close();
	}
}
