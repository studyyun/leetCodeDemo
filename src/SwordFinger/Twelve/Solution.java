package SwordFinger.Twelve;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-21  9:07
 */
public class Solution {

    private int yLength;
    private int xLength;

    public boolean exist(char[][] board, String word) {
        yLength = board.length;
        xLength = board[0].length;
        boolean resultFlag;

        for (int i = 0; i < yLength; i++) {
            for (int j = 0; j < xLength; j++) {
                resultFlag = backTracking(i, j, 0, word, board);
                if (resultFlag) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backTracking(int i, int j, int strIndex, String word, char[][] board) {
        if (strIndex == word.length()) {
            return true;
        }
        if (i < 0 || i >= yLength || j < 0 || j >= xLength) {
            return false;
        }
        if (board[i][j] != word.charAt(strIndex)) {
            return false;
        }

        board[i][j] = ' ';
        strIndex++;
        boolean flag = backTracking(i + 1, j, strIndex, word, board) || backTracking(i - 1, j, strIndex, word, board)
                        || backTracking(i, j + 1, strIndex, word, board) || backTracking(i, j - 1, strIndex, word, board);
        
        //回溯法
        board[i][j] = word.charAt(--strIndex);

        return flag;

    }

    public static void main(String[] args) {
//        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        char[][] board = {{'a', 'b'}, {'c', 'd'}};
        System.out.println(new Solution().exist(board, "abcd"));
    }
}
