import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class KasseIFTest {
	
	Kasse ka1, ka2, ka3,ka4;

			@Before
			public void setUp() throws Exception {
				
				ka1= new Kasse();
				ka2= new Kasse();
				ka3= new Kasse();
				ka4= new Kasse();
			}
		

	@Test
	public void testGetTagesSumme() {
		
		assertEquals(1200, ka1.getTagesSumme());
		}

	@Test
	public void testGetWochenSumme() {
		assertEquals(0, ka1.getWochenSumme());
	}

	@Test
	public void testGetMonatsSumme() {
		assertEquals(0, ka1.getMonatsSumme());
	}

	@Test
	public void testGetJahresSumme() {
		assertEquals(0, ka1.getJahresSumme());
	}
	
	@Test
	public void testBerechneGebuhren(){
		assertEquals(0, ka1.berechneGebuhren());
		
	}

	

}
