package lab10;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Max_minTest {
	
	int[] array = {1,2,3,4,5,20};
	Max_min obj=new Max_min();
	
	@Test
	void testForMax() {
		int max = obj.findMaxInteger(array);
		assertEquals(20, max);
		
	}
	@Test
	void testForMin() {
		int min = obj.findMinInteger(array);
		assertEquals(1, min);
	}

}
