package SwordFinger.Thirteen;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-22  8:18
 */
public class Solution {

    private int count;
    private int m;
    private int n;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        backTracking(0, 0, k, new boolean[m][n]);
        return count;
    }

    private void backTracking(int y, int x, int k, boolean[][] ifChoose) {
        if (y < 0 || y >= m || x < 0 || x >= n) {
            return;
        }

        if (digitSum(y, x) > k) {
            return;
        }

        if (ifChoose[y][x]) {
            return;
        }

        ifChoose[y][x] = true;
        count++;

        backTracking(y + 1, x, k, ifChoose);
        // backTracking(y - 1, x, k, ifChoose);
        backTracking(y, x + 1, k, ifChoose);
        // backTracking(y, x - 1, k, ifChoose);
    }
    
    
    

    private int digitSum(int y, int x) {
        int sum = 0;
        while (y > 0) {
            sum += y % 10;
            y = y / 10;
        }

        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().movingCount(1, 2, 1));
    }
}
