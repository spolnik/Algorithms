import org.junit.Test;
import static org.junit.Assert.*;

public class TheNumberGameDivTwoTest {
	
	@Test
	public void test0() {
		int n = 6;
		assertEquals("John", new TheNumberGameDivTwo().find(n));
	}
	
	@Test
	public void test1() {
		int n = 2;
		assertEquals("Brus", new TheNumberGameDivTwo().find(n));
	}
	
	@Test
	public void test2() {
		int n = 747;
		assertEquals("Brus", new TheNumberGameDivTwo().find(n));
	}
	
	@Test
	public void test3() {
		int n = 128;
		assertEquals("Brus", new TheNumberGameDivTwo().find(n));
	}
}
