import java.util.*;

public class TheNumberGameDivTwo {
	public String find(int n) {
		boolean[] found = new boolean[1001];

        for (int i = 4; i <= n; i++) {
            for (int d = 2; d < i; d++) {
                if (i % d == 0 && !found[i - d]) {
                    found[i] = true;
                    break;
                }
            }
        }

        return found[n] ? "John" : "Brus";
	}
}
