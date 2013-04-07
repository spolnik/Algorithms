import org.junit.Test;
import static junit.framework.Assert.*;

public class GCDFinderTest {
    @Test
    public void testGetGCDNaive() throws Exception {
        GCDFinder gcdFinder = new GCDFinder();
        assertEquals(146, gcdFinder.GetGCDNaive(2336, 1314));
    }

    @Test
    public void testGetGCD() throws Exception {
        GCDFinder gcdFinder = new GCDFinder();
        assertEquals(146, gcdFinder.GetGCD(2336, 1314));
    }

    @Test
    public void testGetLCM() throws Exception {
        GCDFinder gcdFinder = new GCDFinder();
        assertEquals(18, gcdFinder.GetLCM(6, 9));
    }
}
