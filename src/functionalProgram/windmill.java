package functionalProgram;
import java.util.Scanner;

public class windmill {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temparature :");
		double t = scan.nextDouble();
		System.out.println("Enter the speed of wind between 3 to 120 mph :");
		double v = scan.nextDouble();
		scan.close();
		
		 double wind = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		 
		 System.out.println("the wind is chill :"+wind);
	}

}
