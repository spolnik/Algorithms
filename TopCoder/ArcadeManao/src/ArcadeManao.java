import java.util.*;

public class ArcadeManao {
	public int shortestLadder(String[] level, int coinRow, int coinColumn) {

        if (coinRow == level.length)
            return 0;

        int[][] board = new int[level.length][level[0].length()];

        for (int i = 0; i < level.length; i++) {
            String row = level[i];
            char[] chars = row.toCharArray();
            for (int j = 0; j < chars.length; j++)
            {
                char c = chars[j];
                if (c == 'X')
                    board[i][j] = 1;
            }
        }


        for (int result = 1; result < level.length; result++)
        {
            boolean resultOk = true;

            for (int i = level.length - 1; i > 0; i--)
            {
                boolean found = false;

                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == 1 && board[i-1][j] == 1) {
                        found = true;
                        break;
                    }
                }

                if (found)
                    continue;
                else {
                    resultOk = false;
                    break;
                }

            }

            if (resultOk)
                return result;
        }

		return 0;
	}
}
