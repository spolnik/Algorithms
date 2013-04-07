import org.junit.Test;
import static org.junit.Assert.*;

public class TheSwapsDivTwoTest {
	
	@Test
	public void test0() {
		int[] sequence = new int[] {4, 7, 4};
		assertEquals(3, new TheSwapsDivTwo().find(sequence));
	}
	
	@Test
	public void test1() {
		int[] sequence = new int[] {1, 47};
		assertEquals(1, new TheSwapsDivTwo().find(sequence));
	}
	
	@Test
	public void test2() {
		int[] sequence = new int[] {9, 9, 9, 9};
		assertEquals(1, new TheSwapsDivTwo().find(sequence));
	}
	
	@Test
	public void test3() {
		int[] sequence = new int[] {22, 16, 36, 35, 14, 9, 33, 6, 28, 12, 18, 14, 47, 46, 29, 22, 14, 17, 4, 15, 28, 6, 39, 24, 47, 37};
		assertEquals(319, new TheSwapsDivTwo().find(sequence));
	}
}
