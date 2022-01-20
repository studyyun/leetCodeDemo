package SeventyNine;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-01-19  9:16
 */
public class Solution {
    //用二维数组存储四个方位的偏移量，秒！
    private int[][] direction = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    //存储是否被使用
    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        int y = board.length;
        int x = board[0].length;
        visited = new boolean[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (dfsTwo(i, j, board, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfsTwo(int y, int x, char[][] board, int index, String word) {
        //如果已经对比到最后一个字母
        if (index == word.length() - 1) {
            return board[y][x] == word.charAt(index);
        }
        //如果当前位置的字母能匹配上
        if (board[y][x] == word.charAt(index)) {
            //当前字母已被使用的标识符，避免重复使用
            visited[y][x] = true;
            //遍历四个方位，上下左右
            for (int[] direct : direction) {
                int newY = y + direct[0];
                int newX = x + direct[1];
                //如果新的方位在数组范围内，并且没有被使用，则继续递归
                if (isArea(newY, newX, board) && !visited[newY][newX]) {
                    boolean res = dfsTwo(newY, newX, board, index + 1, word);
                    if (res) {
                        return res;
                    }
                }
            }
            //如果四个方位都没有匹配上，进行回溯
            visited[y][x] = false;
        }
        return false;
    }

    private boolean isArea(int y, int x, char[][] board) {
        return x >= 0 && x < board[0].length && y >= 0 && y < board.length;
    }

}
