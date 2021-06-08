public class Test {

    public static int[] testArr(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0, cur = 0, i = 0;
        int[] sumArr = new int[m + n];
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sumArr[i++] = cur;
        }
        return sumArr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5,6};
        int[] ints = Test.testArr(nums1,3, nums2,3);
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }

}
