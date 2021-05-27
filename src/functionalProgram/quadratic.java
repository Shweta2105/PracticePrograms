package functionalProgram;
import java.util.Scanner;

public class quadratic {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value a, b and c :");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double delta = Math.abs(((b * b)-(4 * a * c)));
		double d = 2 * a;
		double sqDelta = Math.sqrt(delta);
		double sq1 = (-b + sqDelta);
		double sq2 = (-b - sqDelta);
		
		double root1 = sq1/d;
		double root2 = sq2/d;
		
		System.out.println(root1+ " "+root2);
	}

}
