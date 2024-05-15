import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//더 많은 부분은 자바독 참조하기 
//assertTrue()
//assertFalse()
//assertNull()
//assertNotNull()
//assertArrrayEquals()

public class CalculatorTest {
	
	private Calculator cal;
	
	//비포 애노테이션을 사용하여서 테스트 메소드에 대한 초기화 작업을 하는것이 추후 문제 방지에 좋다.
	@Before
	public void setup() {
		cal = new Calculator();
		System.out.println("Before");
	}
	
	@Test
	public void add() {
		//System.out.println(cal.add(6, 3));	
		//int,long,String다양한 데이터 타입을 지원
		assertEquals(9, cal.add(6, 3));
		System.out.println("add");
	}
	
	@Test
	public void subtract() {
		//System.out.println(cal.subtract(6, 3));
		//int,long,String다양한 데이터 타입을 지원
		assertEquals(3, cal.subtract(6, 3));
		System.out.println("subtract");
	}
	
	@After
	public void teardown() {
		System.out.println("teardown");
	}

}
