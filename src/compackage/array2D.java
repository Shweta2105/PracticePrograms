package compackage;
import java.util.Scanner;
public class array2D {
	public static void main(String[] args) {
		int row,col,i,j;
		int arr[][]=new int[10][10];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter row for array : ");
		row = scan.nextInt();
		System.out.println("Enter column for array :");
		col = scan.nextInt();
		
		System.out.println("Enter "+row*col+" Array elements: ");
		for(i=0; i<row; i++) {
			for(j=0; j<col; j++) {
				arr[i][j] = scan.nextInt();
				
			}
		}
		System.out.println("The array is :");
		for(i=0; i<row; i++) {
			for(j=0; j<col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}
