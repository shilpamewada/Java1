package Assignment03;
import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the base  of the triangle :- ");
		
		double base = scanner.nextDouble();
		
//		double base = 4;
//		double height =5;
		
		
		
		System.out.println("Enter the height of the triangle :- ");
		
		double height = scanner.nextDouble();
		
		
		double area = 0.5 * base * height ;
		
		
		System.out.println("Enter the area of triangle is " + area);
		
		scanner.close();
		
	}

}
