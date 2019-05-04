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
		if(n==0) {
			return 0;
		}else if(n==1){
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	// Array Sumary
	public static int arraySumatory( int[] a) {
       return sumar(a, a.length-1);
	}
	
	private static int sumar(int[] a, int n) {
		if(n==0) {
			return a[0];
		}
		  return a[n] + sumar(a, n-1);
	}
	
	
	// Mezclar cadenas
	public static String mezclarCadenas(String cad1, String cad2) {
		return mezclar(cad1, cad2, cad1.length()-1);
	}
	
	public static String mezclar(String c1, String c2, int length) {
		String men = "";
		if() {
			
		}else {
			
		}
		return men;
	}
	
	public static String mezclar2(String c1, String c2, int length) {
	   String men = c1.charAt(length) + "" + c2.charAt(length);
		if(length == c1.length()-1) {
			return men;
		}else {
			return men + mezclar2(c1, c2, length);
		}	}

	
	
	
	// Quién califica
	public static void main(String[] args) {
		System.out.println(24-17 +1);
	}
	
	

	
	
	
	
	
	
	
	}
