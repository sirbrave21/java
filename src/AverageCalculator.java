import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First exam result: ");
		
		double a = sc.nextDouble();
		
		System.out.println("Second exam result: ");
		
		double b = sc.nextDouble();
		
		System.out.println("Third exam result: ");
		
		double c = sc.nextDouble();
		
		double d= (( a + b + c ) / 3);
		
		if ( d >= 90 && d < 100 ) {
			
		System.out.println("Congrats.You get " + d + " points. You passed the exam with AA!");
		}
		
		else if ( d >= 80 && d <= 90 ) {
			
			System.out.println("Congrats.You get " + d + " points. You passed the exam with BA!");
			}
        else if ( d >= 70 && d <= 80 ) {
			
			System.out.println("Congrats.You get " + d + " points. You passed the exam with BB!");
			}
        else if ( d >= 60 && d <= 70 ) {
			
			System.out.println("Congrats.You get " + d + " points. You passed the exam with CB!");
			}
        else if ( d >= 60 && d <= 50 ) {
			
			System.out.println("Congrats.You get " + d + " points. You passed the exam with CC!");
			}
        else if (d <= 50 && d >= 0) {
			
			System.out.println("You get " + d + " points. You failed the exam.");
			}
       else if ( d > 100 ) {
			
		   System.out.println("Invalid Value");
			}
       else {
    	   System.out.println("Invalid Value");
    	   
       }
			
	}
}
