import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	

TODoefening myTimeOfDay = new TODoefening(16, 31);
	    
	@Test
	void testConstructor(){
		assertEquals(16, myTimeOfDay.getHours());
		assertEquals(31, myTimeOfDay.getMinutes());}
	    
	@Test
	void testSetHours()
	{	    
	    myTimeOfDay.setHours(18);
	    assertEquals(18, myTimeOfDay.getHours());
	    assertEquals(31, myTimeOfDay.getMinutes());}
	@Test
	void testSetMinutes() {
	    myTimeOfDay.setMinutes(30);
	    assertEquals(16, myTimeOfDay.getHours());
	    assertEquals(30, myTimeOfDay.getMinutes());
	}

}
