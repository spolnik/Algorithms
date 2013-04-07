import java.util.*;

public class TheSwapsDivTwo {
	public int find(int[] sequence) {
        int counter = 0;
        int duplicated = 0;

        for (int i = 0; i < sequence.length; i++)
        {
            for (int j = sequence.length - 1; j > i; j--)
            {
                if (sequence[i] == sequence[j])
                    duplicated = 1;
                else
                    counter++;
            }
        }

        return counter + duplicated;
	}
}
