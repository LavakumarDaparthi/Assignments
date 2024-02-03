import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		fib(n);
	}

	private static void fib(int n) {
		int f=0;
		int s=1;
		System.out.print(f+" "+s);
		for(int i=3;i<=n;i++) {
			int sum=f+s;
			System.out.print(" "+sum);
			f=s;
			s=sum;
		}
	}
}
