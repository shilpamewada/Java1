package Assignment03;
import java.util.Scanner;

public class AreaOfCircle {   

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the radius of the circle :- ");
		
		double radius = scanner.nextDouble();
		
//		double radius = 5.0;
		
		
		double area = Math.PI * Math.pow(radius ,2);
		
		 System.out.println("the area of the circle is: "  + area);
		
		 
		 scanner.close();
	}

}
