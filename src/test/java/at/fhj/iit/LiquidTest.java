package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * This class tests the Liquid class
 */

@DisplayName("Testing Liquid implementation")
public class LiquidTest {
	private Liquid lN, lA;

	/**
	 * inits an alcoholic and nonalcoholic liquid for EACH test
	 */
	@BeforeEach
	void setup() {
		// SETUP PHASE
		lN = new Liquid("Wasser", 0.3, 0);
		lA = new Liquid("Wein", 0.125, 13);
	}

	/**
	 * Tests the constructor of a non alcoholic liquid
	 */

	@Test
	@DisplayName("Testing constructor non alcoholic")
	public void testConstructorNonAlcoholic(){
		assertEquals(lN.getName(), "Wasser");
		assertEquals(lN.getVolume(), 0.3, 0.001);
		assertEquals(lN.getAlcoholPercent(), 0, 0.001);
	}
	/**
	 * Tests the constructor of an alcoholic liquid
	 */
	@Test
	@DisplayName("Testing constructor alcoholic")
	public void testConstructorAlcoholic(){
		assertEquals(lA.getName(), "Wein");
		assertEquals(lA.getVolume(), 0.125, 0.001);
		assertEquals(lA.getAlcoholPercent(), 13, 0.001);
	}
	/**
	 * Tests the name setter of a liquid
	 */
	@Test
	@DisplayName("Test name setter")
	public void testNameSetter(){
		lN.setName("Granderwasser");
		assertEquals(lN.getName(), "Granderwasser");
	}
	/**
	 * Tests the volume setter of a liquid
	 */
	@Test
	@DisplayName("Testing volume setter")
	public void testVolumeSetter(){
		lN.setVolume(0.5);
		assertEquals(lN.getVolume(), 0.5, 0.001);

	}
	/**
	 * Tests the alcoholPercent setter of a liquid
	 */
	@Test
	@DisplayName("Testing alcoholPercent setters")
	public void testAlcoholPercentSetter(){
		lN.setAlcoholPercent(3.2);
		assertEquals(lN.getAlcoholPercent(), 3.2, 0.001);

	}
}
