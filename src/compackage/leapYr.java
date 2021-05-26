package compackage;
import java.util.Scanner;
public class leapYr {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = scan.nextInt();
		
		scan.close();
		
		if(year%100 == 0 && year%400 == 0 ) {
			System.out.println(year +"Year is leap year");
		}
		else if(year%100 != 0 && year%4 == 0) {
			System.out.println(year +" leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	
	}
}
