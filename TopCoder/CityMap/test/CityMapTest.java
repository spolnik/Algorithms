import org.junit.Test;
import static org.junit.Assert.*;

public class CityMapTest {
	
	@Test
	public void test0() {
		String[] cityMap = new String[] {"M....M",
 "...R.M",
 "R..R.R"};
		int[] POIs = new int[] {3, 4};
		assertEquals("MR", new CityMap().getLegend(cityMap, POIs));
	}
	
	@Test
	public void test1() {
		String[] cityMap = new String[] {"XXXXXXXZXYYY"};
		int[] POIs = new int[] {1, 8, 3};
		assertEquals("ZXY", new CityMap().getLegend(cityMap, POIs));
	}
	
	@Test
	public void test2() {
		String[] cityMap = new String[] {"...........",
 "...........",
 "...........",
 "..........T"};
		int[] POIs = new int[] {1};
		assertEquals("T", new CityMap().getLegend(cityMap, POIs));
	}
	
	@Test
	public void test3() {
		String[] cityMap = new String[] {"AIAAARRI.......GOAI.",
 ".O..AIIGI.OAAAGI.A.I",
 ".A.IAAAARI..AI.AAGR.",
 "....IAI..AOIGA.GAIA.",
 "I.AIIIAG...GAR.IIAGA",
 "IA.AOA....I....I.GAA",
 "IOIGRAAAO.AI.AA.RAAA",
 "AI.AAA.AIR.AGRIAAG..",
 "AAAAIAAAI...AAG.RGRA",
 ".J.IA...G.A.AA.II.AA"}
;
		int[] POIs = new int[] {16,7,1,35,11,66}
;
		assertEquals("GOJIRA", new CityMap().getLegend(cityMap, POIs));
	}
}
