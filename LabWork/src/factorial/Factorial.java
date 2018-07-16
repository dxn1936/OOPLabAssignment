package factorial;

public class Factorial {
	
	public static Integer calculateFactorial(Integer number) {
		if (number == 0) { 
			return 1;    
		}
		else { 
			return(number * calculateFactorial(number - 1));   
		}
	}
}
