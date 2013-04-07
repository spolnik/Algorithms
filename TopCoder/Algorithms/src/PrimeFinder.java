import java.util.Arrays;

public class PrimeFinder {
    public boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i+=2)
            if (n % i == 0)
                return false;

        return true;
    }

    public boolean isPrimeNaive(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public boolean[] sieve(int n) {
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true);

        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (primes[i])
                for (int k = i * i; k <=n ; k+=i)
                    primes[k] = false;

        return primes;
    }
}
