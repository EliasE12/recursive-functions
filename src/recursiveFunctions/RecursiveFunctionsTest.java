package recursiveFunctions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursiveFunctionsTest {

	
	@Test
	void factorialTest() {
		
		int N1 = 10;
		assertEquals(3628800, RecursiveFunctions.factorial(N1), " Not is corret");

		int N2 = 5;
		assertEquals(120, RecursiveFunctions.factorial(N2), " Not is corret");
		
		int N3 = 3;
		assertEquals(6, RecursiveFunctions.factorial(N3), " Not is corret");
		
		
	}
	
	
	@Test
	void fibonacciTest() {
		
		int N1 = 25;
		assertEquals(75025, RecursiveFunctions.fibonacci(N1), "Not is correct");
		
		int N2 = 20;
		assertEquals(6765, RecursiveFunctions.fibonacci(N2), "Not is correct");

		int N3 = 10;
		assertEquals(55, RecursiveFunctions.fibonacci(N3), "Not is correct");

	}
	
	@Test
	void arraySumary() {
		
		int[] A1 = {12,4,7,5,8,6,9,3};
		assertEquals(54,RecursiveFunctions.arraySumatory(A1));
		
		int[] A2 = {8,14,8,10,6,11,6};
		assertEquals(63,RecursiveFunctions.arraySumatory(A2));

		int[] A3 = {6,4,20,5,9,6,7};
		assertEquals(57,RecursiveFunctions.arraySumatory(A3));

		
	}
	
	

}
