package Parkhaus;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AutoTest {

	Auto auto1= new Auto();
	Auto auto2= new Auto();
	Auto auto3= new Auto();

	@Before
	public void setUp() throws Exception{

		auto1.setKennzeichen("BN_320");
		auto2.setKennzeichen("ST_385");
		auto3.setKennzeichen("KL_9236");

	}
	
	
	@Test
	public void testSetKennzeichen1(){
		assertEquals("BN_320",auto1.getKennzeichen());
	}
	
	@Test
	public void testGetKennzeichen2(){
		assertEquals("ST_385",auto2.getKennzeichen());
	}
	
	@Test
	public void testGetKennzeichen3(){
		assertEquals("KL_9236",auto3.getKennzeichen());
	}

}
