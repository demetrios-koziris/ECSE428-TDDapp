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

		String desc = "Test 0.80 for CANADA & LETTER & weight<=30 & METER_POSTAL_INDICIA";
		assertEquals(desc, 0.80f, postal.getPostalRate(), delta);
	}


	@Test
	public void Test3ia3() {

		PostalRateCalculator postal = new PostalRateCalculator();
		postal.dest = PostalRateCalculator.Destination.CANADA;
		postal.length = 150;
		postal.width = 100;
		postal.thickness = 1;
		postal.weight = 10;
		postal.payment = PostalRateCalculator.Payment.STAMP_SINGLE;

		String desc = "Test 1.00 for CANADA & LETTER & weight<=30 & STAMP_SINGLE";
		assertEquals(desc, 1.00f, postal.getPostalRate(), delta);
	}


	@Test
	public void Test3ib1() {

		PostalRateCalculator postal = new PostalRateCalculator();
		postal.dest = PostalRateCalculator.Destination.CANADA;
		postal.length = 150;
		postal.width = 100;
		postal.thickness = 1;
		postal.weight = 40;
		postal.payment = PostalRateCalculator.Payment.STAMP_BOOKLET;

		String desc = "Test 1.20 for CANADA & LETTER & 30<weight<=50 & STAMP_BOOKLET";
		assertEquals(desc, 1.20f, postal.getPostalRate(), delta);
	}


	@Test
	public void Test3ib2() {

		PostalRateCalculator postal = new PostalRateCalculator();
		postal.dest = PostalRateCalculator.Destination.CANADA;
		postal.length = 150;
		postal.width = 100;
		postal.thickness = 1;
		postal.weight = 40;
		postal.payment = PostalRateCalculator.Payment.METER_POSTAL_INDICIA;

		String desc = "Test 1.19 for CANADA & LETTER & 30<weight<=50 & METER_POSTAL_INDICIA";
		assertEquals(desc, 1.19f, postal.getPostalRate(), delta);
	}


	@Test
	public void Test3ib3() {

		PostalRateCalculator postal = new PostalRateCalculator();
		postal.dest = PostalRateCalculator.Destination.CANADA;
		postal.length = 150;
		postal.width = 100;
		postal.thickness = 1;
		postal.weight = 40;
		postal.payment = PostalRateCalculator.Payment.STAMP_SINGLE;

		String desc = "Test 1.20 for CANADA & LETTER & 30<weight<=50 & STAMP_SINGLE";
		assertEquals(desc, 1.20f, postal.getPostalRate(), delta);
	}


	@Test
	public void Test3iia1() {

		PostalRateCalculator postal = new PostalRateCalculator();
		postal.dest = PostalRateCalculator.Destination.CANADA;
		postal.length = 300;
		postal.width = 200;
		postal.thickness = 10;
		postal.weight = 50;

		postal.payment = PostalRateCalculator.Payment.STAMP_BOOKLET;
		String desc1 = "Test 1.80 for CANADA & OTHER & weight<=100 & STAMP_BOOKLET";
		assertEquals(desc1, 1.80f, postal.getPostalRate(), delta);

		postal.payment = PostalRateCalculator.Payment.STAMP_SINGLE;
		String desc2 = "Test 1.80 for CANADA & OTHER & weight<=100 & STAMP_SINGLE";
		assertEquals(desc1, 1.80f, postal.getPostalRate(), delta);
	}


	@Test
	public void Test3iia2() {

		PostalRateCalculator postal = new PostalRateCalculator();
		postal.dest = PostalRateCalculator.Destination.CANADA;
		postal.length = 300;
		postal.width = 200;
		postal.thickness = 10;
		postal.weight = 50;
		postal.payment = PostalRateCalculator.Payment.METER_POSTAL_INDICIA;

		String desc1 = "Test 1.71 for CANADA & OTHER & weight<=100 & METER_POSTAL_INDICIA";
		assertEquals(desc1, 1.71f, postal.getPostalRate(), delta);
	}


	@Test
	public void Test3iib1() {

		PostalRateCalculator postal = new PostalRateCalculator();
		postal.dest = PostalRateCalculator.Destination.CANADA;
		postal.length = 300;
		postal.width = 200;
		postal.thickness = 10;
		postal.weight = 150;

		postal.payment = PostalRateCalculator.Payment.STAMP_BOOKLET;
		String desc1 = "Test 2.95 for CANADA & OTHER & 100<weight<=200 & STAMP_BOOKLET";
		assertEquals(desc1, 2.95f, postal.getPostalRate(), delta);

		postal.payment = PostalRateCalculator.Payment.STAMP_SINGLE;
		String desc2 = "Test 2.95 for CANADA & OTHER & 100<weight<=200 & STAMP_SINGLE";
		assertEquals(desc1, 2.95f, postal.getPostalRate(), delta);
	}


	@Test
	public void Test3iib2() {

		PostalRateCalculator postal = new PostalRateCalculator();
		postal.dest = PostalRateCalculator.Destination.CANADA;
		postal.length = 300;
		postal.width = 200;
		postal.thickness = 10;
		postal.weight = 150;
		postal.payment = PostalRateCalculator.Payment.METER_POSTAL_INDICIA;

		String desc1 = "Test 2.77 for CANADA & OTHER & 100<weight<=200 & METER_POSTAL_INDICIA";
		assertEquals(desc1, 2.77f, postal.getPostalRate(), delta);
	}
	
}

