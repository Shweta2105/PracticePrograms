package compackage;
import java.util.Scanner;

public class quotientReminder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Dividend: ");
		int divid = scan.nextInt();
		System.out.println("Enter the divisor");
		int div = scan.nextInt();
		
		scan.close();
		double quot = (double)divid/div;
		double remi = (double)divid%div;
		System.out.println(divid+" and "+div+" gives quotient "+quot);
		System.out.println(divid+" and "+div+" gives reminder "+remi);
	}

}
