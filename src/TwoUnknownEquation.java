import java.util.Scanner;

public class TwoUnknownEquation {

	public static void main(String[] args) {
		
		System.out.println("If you have ax2+bx+c type equation.You can use this programme. Just enter a,b and c values.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a: ");
		double a= sc.nextDouble();
		
		System.out.println("Enter value of b: ");
		double b= sc.nextDouble();
		
		System.out.println("Enter value of c: ");
		double c= sc.nextDouble();
		
		double delta = Math.pow(b,2) - ( 4 * a * c); 
		// Delta = b2-4ac
		
		if ( delta > 0) {
	    //If delta > 0 , We have 2 roots.
		double e = ((-b + Math.sqrt(delta)) / 2 * a);
		double f = ((-b - Math.sqrt(delta)) / 2 * a);
		System.out.println("Roots of an equation: " + f + "," + e);
		}
		
		else if ( delta < 0 ) {
			//If delta < 0 , We don't have any root.
			System.out.println("Roots of an equation: No Root");
		}
		else {
			//If delta = 0 , We have 2 equal(same) roots.	
			double g = - b / 2*a;
				System.out.println("Roots of an equation: " + g);
			
		}
		
	}
}
