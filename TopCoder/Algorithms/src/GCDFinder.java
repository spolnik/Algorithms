public class GCDFinder {

    public int GetGCDNaive(int a, int b) {
        for (int i = Math.min(a, b); i >= 1; i--)
            if (a % i == 0 && b % i == 0)
                return i;

        return 1;
    }

    public int GetGCD(int a, int b) {
        if (b ==  0)
            return a;
        return GetGCD(b, a % b);
    }

    public int GetLCM(int a, int b) {
        return b * a/GetGCD(a, b);
    }
}
