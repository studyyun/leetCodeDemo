import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> collect = list.stream().filter((i) -> (i / 5) == 1).collect(Collectors.toList());

        if (collect == null || collect.isEmpty()){
            System.out.println("hello");
        }
        
        int j = 2;
        collect.forEach((i)->{
            if ((i & 1) == 1){
                return;
            }
            System.out.println(i);
        });
        
        List<String> list2 = new ArrayList<>();
        list2.add("");
        list2.add("");
        list2.add("");
        list2.add("");
        list2.add("");
        list2.add("");

        
    }

}
