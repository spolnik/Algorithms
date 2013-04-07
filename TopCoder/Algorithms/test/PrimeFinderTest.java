import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeFinderTest {
    @Test
    public void testIsPrime() throws Exception {
        PrimeFinder primeFinder = new PrimeFinder();
        assertEquals(false, primeFinder.isPrime(4));
        assertEquals(false, primeFinder.isPrime(42341));
        assertEquals(false, primeFinder.isPrime(423));
        assertEquals(false, primeFinder.isPrime(447));
    }

    @Test
    public void testIsPrimeSimple() throws Exception {
        PrimeFinder primeFinder = new PrimeFinder();
        assertEquals(false, primeFinder.isPrimeNaive(4));
        assertEquals(false, primeFinder.isPrimeNaive(42341));
        assertEquals(false, primeFinder.isPrimeNaive(423));
        assertEquals(false, primeFinder.isPrimeNaive(447));
    }

    @Test
    public void testSieve() throws Exception {
        PrimeFinder primeFinder = new PrimeFinder();
        boolean[] results = primeFinder.sieve(10);

        assertEquals(false, results[0]);
        assertEquals(false, results[1]);
        assertEquals(true, results[2]);
        assertEquals(true, results[3]);
        assertEquals(false, results[4]);
        assertEquals(true, results[5]);
        assertEquals(false, results[6]);
        assertEquals(true, results[7]);
        assertEquals(false, results[8]);
        assertEquals(false, results[9]);
        assertEquals(false, results[10]);
    }
}
