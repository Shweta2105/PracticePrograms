package compackage;
import java.util.Scanner;

public class harmonic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		scan.close();
		
		double harm = 0;
		for(int i=1; i<num; i++) {
			harm += (float)1/i;
			System.out.println(harm);
		}
	}

}
