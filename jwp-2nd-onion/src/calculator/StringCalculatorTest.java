package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator cal;
	
	@Before
	public void setup() {
		cal = new StringCalculator();
	}
	
	@Test
	public void add_null_check() {
		assertEquals(0,cal.add(null));
		assertEquals(0,cal.add(""));
	}
	
	@Test
	public void add_number_one() throws Exception {
		assertEquals(1, cal.add("1"));
	}
	
	@Test
	public void add_rest_splict() throws Exception{
		assertEquals(3, cal.add("1,2"));
	}
	
}
