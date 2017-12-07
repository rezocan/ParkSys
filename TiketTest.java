package Parkhaus;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TiketTest {
	
	Tiket tiket1= new Tiket();
	Tiket tiket2= new Tiket();
	Tiket tiket3= new Tiket();
	
	@Before
	public void setUp() throws Exception{
		tiket1.getGebuehren(3);
		tiket1.setEinfahrt(6,30);
		tiket1.setAusfahrt(7, 15);
		tiket2.setEinfahrt(6,30);
		tiket2.setAusfahrt(7, 31);
		tiket2.getGebuehren(1);
	
	}
	@Test
	public void testGetGebuehr1(){
		assertEquals(3, tiket1.getGebuehren(3));
	}
	@Test
	public void testGetGebuehr2(){
		assertEquals(4, tiket2.getGebuehren(2));
	}
}
