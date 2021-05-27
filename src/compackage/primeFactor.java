package compackage;
import java.util.Scanner;

public class primeFactor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		scan.close();
		for(int counter=2; counter<num; counter++) {
			while(num%counter == 0) {
				num=num/counter;
				System.out.println(counter);
			}
		}
		if (num > 2) {
			System.out.println(num);
		}
	}

}
