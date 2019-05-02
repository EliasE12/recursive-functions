package recursiveFunctions;

public class RecursiveFunctions {

	// Factorial 
	public static int factorial( int n) {
		if(n==0) 
			return 1;
		else {
			return n * factorial(n-1); 
		}
	}
	
	// Fibonacci
	public static int fibonacci(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	// Array Sumary
	public static int arraySumatory( int[] a) {
       return sumar(a, a.length);
	}
	
	private static int sumar(int[] a, int n) {
		if(n==0) {
			return a[0];
		}
		  return a[n] + sumar(a, n-1);
	}
	
	
	public static void main(String[] args) {
	
	}
	
	
	
}
