import java.util.Scanner;

public class DecimalOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();
		decimalOrNot(num);
		sc.close();
	}

	private static void decimalOrNot(double num) {
		if(num%1!=0) {
			System.out.println("Decimal number");
		}else {
			System.out.println("Not Decimal number");
		}
		
	}
}
