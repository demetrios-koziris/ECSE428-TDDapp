package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculator.PostalRateCalculator;

public class PostalRateCalculatorTest {


	@Before
	public void main() {
	}


	@Test
	public void Test1() {

		PostalRateCalculator postal = new PostalRateCalculator();
		postal.length = 150;
		postal.width = 100;
		postal.thickness = 1;
		postal.weight = 10;

		String desc = "determineType() must return LETTER for valid LETTER parameters";
		assertEquals(desc, PostalRateCalculator.Type.LETTER, postal.determineType());
	}


	@Test
	public void Test2() {

		PostalRateCalculator postal = new PostalRateCalculator();
		postal.length = 300;
		postal.width = 200;
		postal.thickness = 10;
		postal.weight = 200;

		String desc = "determineType() must return OTHER for valid OTHER parameters";
		assertEquals(desc, PostalRateCalculator.Type.OTHER, postal.determineType());
	}

}

