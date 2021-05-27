package compackage;
import java.util.Scanner;

public class vowelConsonant {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an alphbet: ");
		char ch = scan.next().charAt(0);
		
		scan.close();
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch +" is vowel");
		}
		else {
			System.out.println(ch+" is consonant");
			
		}
	}

}
