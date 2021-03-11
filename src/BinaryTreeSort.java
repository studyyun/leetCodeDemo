public class BinaryTreeSort {

    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) return false;
        return sort(sequence, 0, sequence.length - 1);
    }

    public static boolean sort(int[] sequence, int start, int end) {

        if (end <= start) return true;
        int i = start;
        for (; i < end; i++) {
            if (sequence[i] > sequence[end]) break;
        }
        for (int j = i; j < end; j++) {
            if (sequence[j] < sequence[end]) return false;
        }

        return sort(sequence,start,i-1) && sort(sequence,i,end-1);
    }

    public static void main(String[] args) {
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort();
        int[] sequence = {4,8,6,12,16,14,10};
        System.out.println(binaryTreeSort.VerifySquenceOfBST(sequence));

    }

}
