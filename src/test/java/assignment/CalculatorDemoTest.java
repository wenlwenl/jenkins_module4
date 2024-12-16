package assignment;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CalculatorDemoTest {

	@Test
	public void testAdd() {
		CalculatorDemo myCalculator = new CalculatorDemo();
		assertEquals(7, myCalculator.add(3, 4));
	}
}
