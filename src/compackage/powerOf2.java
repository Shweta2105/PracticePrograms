package compackage;
import java.util.Scanner;

public class powerOf2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int num = scan.nextInt();
		scan.close();
		int sum = 1;
		for(int i=0; i<num; i++) {
			sum = 2*sum;
			System.out.println(sum);
		}
	}

}
