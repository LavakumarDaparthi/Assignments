import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if( prime(num)) {
			System.out.println("Given num is Prime Number");
		}else {
			System.out.println("Given num is Not a Prime Number");
		}
		sc.close();
	}

	private static boolean prime(int num) {
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
