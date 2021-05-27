package compackage;

import java.util.Scanner;

public class oddEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the number: ");
	int num = scan.nextInt();
	
	scan.close();
	if(num%2 == 0) {
		System.out.println(num +"Is Even number");
	}
	else {
		System.out.println(num +"Is odd number");
	}
	}
}
