package Review;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-03-08  10:50
 */
public class Solution17 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int left = (n + m + 1) / 2;
        int right = (n + m + 2) / 2;
        //将偶数和奇数的情况合并，如果是奇数，会求两次同样的 k 。
        return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, left) + getKth(nums1, 0, n - 1, nums2, 0, m - 1, right)) * 0.5;
    }

    private int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        //让 len1 的长度小于 len2，这样就能保证如果有数组空了，一定是 len1 
        if (len1 > len2) return getKth(nums2, start2, end2, nums1, start1, end1, k);
        if (len1 == 0) return nums2[start2 + k - 1];

        if (k == 1) return Math.min(nums1[start1], nums2[start2]);

        int i = start1 + Math.min(len1, k / 2) - 1;
        int j = start2 + Math.min(len2, k / 2) - 1;

        if (nums1[i] > nums2[j]) {
            return getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
        }
        else {
            return getKth(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
        }
    }
    
    /*public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int length1 = nums1.length;
        int length2 = nums2.length;
        int left = (length1 + length2 + 1) / 2;
        int right = (length1 + length2 + 2) / 2;
        int res1 = recursion(left, nums1, nums2, 0, 0);
        int res2 = recursion(right, nums1, nums2, 0, 0);
        return (res1 + res2) / 2.0;
    }

    private int recursion(int k, int[] nums1, int[] nums2, int index1, int index2) {
        int n = k / 2;
        if (index1 + n - 1 >= nums1.length) {
            int i = nums1.length - index1;
            return nums1[index1] <= nums2[k - 1 - i] ? nums2[k - 1 - i] : nums1[index1];
        }
        if (index2 + n - 1 >= nums2.length) {
            int i = nums2.length - index2;
            return nums2[index2] <= nums1[k - 1 - i] ? nums1[k - 1 - i] : nums2[index2];
        }
        if (n == 0) {
            if (index1 < nums1.length && index2 < nums2.length) {
                return nums1[index1] >= nums2[index2] ? nums2[index2] : nums1[index1];
            } else if (index1 >= nums1.length) {
                return nums2[index2];
            } else {
                return nums1[index1];
            }
        }
        if (nums1[index1 + n - 1] >= nums2[index2 + n - 1]) {
            index2 += n;
        } else {
            index1 += n;
        }
        return recursion(k - n, nums1, nums2, index1, index2);
    }*/
    public static void main(String[] args) {
//        int[] nums1 = {1,3,4,5,6};
        int[] nums1 = {};
//        int[] nums2 = {2,4,6,7,9};
        int[] nums2 = {2, 3};
        System.out.println(new Solution17().findMedianSortedArrays(nums1, nums2));
    }
}
