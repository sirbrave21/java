import java.util.Scanner;

public class BmiCalculator{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter your weight(kilograms): ");
	    double weight = sc.nextDouble();
	    
	    System.out.println("Enter your height(centimeters): " );
	    double height = sc.nextDouble();
	    height = height / 100; //We multiplied with 100 because we converted to centimeter.
	    
	    double bmi = weight / Math.pow(height, 2);
	    System.out.println("Your BMI is : " + bmi);
	    if( bmi > 30) {
	    	System.out.println("Obesity");
	    }
	    else if(bmi > 25 && bmi < 30) {
	    	System.out.println("Overweight");
	    }
	    else if(bmi > 18.5 && bmi < 25) {
	    	System.out.println("Normal Weight");
	    }
	    else {
	    	System.out.println("Underweight");
	    }

	}

}
