import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	double n1=2.2,n2=3.3,result;
	Calculator c= new Calculator();

	@Test
	public void additionTest() {
		 result = c.addition(n1, n2);
		 assertTrue(result==n1+n2);
	}
	
	@Test
	public void subractionTest() {
		 result = c.subraction(n1, n2);
		 assertTrue(result==n1-n2);
	}
	
	@Test
	public void multiplicationTest() {
		 result = c.multiplication(n1, n2);
		 assertTrue(result==n1*n2);
	}
	@Test
	public void divisionTest() {
		 result = c.division(n1, n2);
		 assertTrue(result==n1/n2);
	}
	@Test
	public void modulusTest() {
		 result = c.modulus(n1, n2);
		 assertTrue(result==n1%n2);
	}

}
