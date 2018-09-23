package pkgTest;

import pkgCalc.CostCalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CostCalcTest {

	@Test
	public void monthPayTest() {
		CostCalc testCar = new CostCalc(35000,0,.1,60);
		double diff = testCar.monthPay()-743.65;
		assertTrue(diff<.01 && diff>-.01); /* Could not find easy way to round doubles
				decided to see if difference is less than $0.01 to judge if calculation worked */
	}
	@Test
	public void interestPayTest() {
		CostCalc testCar = new CostCalc(35000,0,.1,60);
		double diff = testCar.interestPay()-9618.79;
		assertTrue(diff<.01 && diff>-.01);
	}

}
