import java.util.*;

public class TheExperimentDiv2 {
	public int[] determineHumidity(int[] intensity, int L, int[] leftEnd) {
		// intensity 1 -50

        int[] results = new int[leftEnd.length];

        for (int j = 0; j < leftEnd.length; j++) {
            int from = leftEnd[j];
            int to = L + from;

            for (int i = from; i < to; i++)
            {
                results[j] += intensity[i];
            }

            ArrayList checked = new ArrayList();

            for (int k = 0; k < j; k++) {
                int fromHigher = leftEnd[k];
                int toHigher = L + fromHigher;

                for (int l = fromHigher; l < toHigher; l++)
                {
                    if (checked.contains(l))
                        continue;

                    if (l >= from && (l + 1) <= to) {
                        results[j] -= intensity[l];
                        checked.add(l);
                    }

                    if (results[j] == 0 || results[j] < 0) {
                        results[j] = 0;
                        break;
                    }
                }
            }
        }

        return results;
	}
}
