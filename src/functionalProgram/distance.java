package functionalProgram;
import java.util.Scanner;

public class distance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x and y : ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		double dist = Math.sqrt(x*x + y*y);
		
		System.out.println("The distance of ("+ x +","+ y +") ="+dist );
		
	}
}
