import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
	    TODoefening myTimeOfDay = new TODoefening(16, 31);
	    assertEquals(16, myTimeOfDay.getHours());
	    assertEquals(31, myTimeOfDay.getMinutes());

	    myTimeOfDay.setHours(18);
	    assertEquals(18, myTimeOfDay.getHours());
	    assertEquals(31, myTimeOfDay.getMinutes());

	    myTimeOfDay.setMinutes(30);
	    assertEquals(18, myTimeOfDay.getHours());
	    assertEquals(30, myTimeOfDay.getMinutes());
	}

}
