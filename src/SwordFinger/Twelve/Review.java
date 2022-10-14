package SwordFinger.Twelve;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-11  8:55
 */
public class Review {

    private int m = 0, n = 0;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (recursion(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean recursion(char[][] board, int i, int j, String word, int strIndex) {
        if (strIndex == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i == m || j == n) {
            return false;
        }
        if (word.charAt(strIndex) != board[i][j]) {
            return false;
        }
        board[i][j] = ' ';
        boolean flag = recursion(board, i + 1, j, word, strIndex + 1) || recursion(board, i - 1, j, word, strIndex + 1)
                || recursion(board, i, j + 1, word, strIndex + 1) || recursion(board, i, j - 1, word, strIndex + 1);

        //回溯
        board[i][j] = word.charAt(strIndex);
        return flag;
    }

    public static void main(String[] args) {
//        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//        String word = "ABCCED";

//        char[][] board = {{'a','b'}};

//        char[][] board = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
//        String word = "AAB";

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCESEEEFS";
        System.out.println(new Review().exist(board, word));
    }
}
