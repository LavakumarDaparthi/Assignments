import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		palindrome(num);
			
		sc.close();
	}

	private static void palindrome(int num) {
		int tem=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum*10 + rem;
			num=num/10;
		}
		if(tem == sum) {
			System.out.println("Given num is Palindrome Number");
		}else {
			System.out.println("Given num is Not a Palindrome Number");
		}
		
	}
}
