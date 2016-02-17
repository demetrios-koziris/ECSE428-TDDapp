package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculator.PostalRateCalculator;

public class PostalRateCalculatorTest {

	//acceptable delta when making comparisons with floating points
	float delta = 0.0f;


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


	@Test
	public void Test3ia1() {

		PostalRateCalculator postal = new PostalRateCalculator();
		postal.dest = PostalRateCalculator.Destination.CANADA;
		postal.length = 150;
		postal.width = 100;
		postal.thickness = 1;
		postal.weight = 10;
		postal.payment = PostalRateCalculator.Payment.STAMP_BOOKLET;

		String desc = "Test 0.85 for CANADA & LETTER & weight<=30 & STAMP_BOOKLET";
		assertEquals(desc, 0.85f, postal.getPostalRate(), delta);
	}


	@Test
	public void Test3ia2() {

		PostalRateCalculator postal = new PostalRateCalculator();
		postal.dest = PostalRateCalculator.Destination.CANADA;
		postal.length = 150;
		postal.width = 100;
		postal.thickness = 1;
		postal.weight = 10;
		postal.payment = PostalRateCalculator.Payment.METER_POSTAL_INDICIA;

		String desc = "Test 0.85 for CANADA & LETTER & weight<=30 & METER_POSTAL_INDICIA";
		assertEquals(desc, 0.80f, postal.getPostalRate(), delta);
	}
}

