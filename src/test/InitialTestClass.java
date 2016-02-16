package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculator.PostalRateCalculator;

public class InitialTestClass {


	@Before
	public void main() {
	}

	@Test
	public void initialTest() {
	    assertEquals("initial test", 0, PostalRateCalculator.returnZero());
	}
	

}

