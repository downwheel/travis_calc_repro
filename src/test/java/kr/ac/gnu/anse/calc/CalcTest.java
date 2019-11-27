package kr.ac.gnu.anse.calc;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {
	
	@Test
	public void testAdd() {
		calc_ c = new calc_();
		assertEquals(30,c.add(10, 20));
	}
}
