import java.util.Scanner;

public class IsPrimeMethod {
	
	public static boolean Prime(int number) {
        
		boolean IsPrime = true;
        
		if(number <= 1)
        	
			return false;
        
		for(int i=2 ; i < number/2 ; i++) {
			
			if(number % i == 0)
				
				return false;
        	
		}
        
		return true;
	}

}
