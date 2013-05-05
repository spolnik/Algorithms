import org.junit.Test;
import static org.junit.Assert.*;

public class TheExperimentDiv2Test {
	
	@Test
	public void test0() {
		int[] intensity = new int[] {3, 4, 1, 1, 5, 6};
		int L = 3;
		int[] leftEnd = new int[] {3, 1, 0};
		assertArrayEquals(new int[] {12, 5, 3 }, new TheExperimentDiv2().determineHumidity(intensity, L, leftEnd));
	}
	
	@Test
	public void test1() {
		int[] intensity = new int[] {5, 5};
		int L = 2;
		int[] leftEnd = new int[] {0, 0};
		assertArrayEquals(new int[] {10, 0 }, new TheExperimentDiv2().determineHumidity(intensity, L, leftEnd));
	}
	
	@Test
	public void test2() {
		int[] intensity = new int[] {92, 11, 1000, 14, 3};
		int L = 2;
		int[] leftEnd = new int[] {0, 3};
		assertArrayEquals(new int[] {103, 17 }, new TheExperimentDiv2().determineHumidity(intensity, L, leftEnd));
	}
	
	@Test
	public void test3() {
		int[] intensity = new int[] {2, 6, 15, 10, 8, 11, 99, 2, 4, 4, 4, 13};
		int L = 4;
		int[] leftEnd = new int[] {1, 7, 4, 5, 8, 0};
		assertArrayEquals(new int[] {39, 14, 110, 0, 13, 2 }, new TheExperimentDiv2().determineHumidity(intensity, L, leftEnd));
	}
}
