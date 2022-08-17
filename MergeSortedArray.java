import java.util.*;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] numArr1 = { 8, 0, 0, 0 };
        int[] numArr2 = { 1, 2, 3 };
        merge(numArr1, 1, numArr2, 3);

        for (int i = 0; i < numArr1.length; i++) {
            System.out.print(numArr1[i] + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tempArr = Arrays.copyOf(nums1, nums1.length);
        int mPos = m - 1;
        int nPos = n - 1;
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (mPos >= 0 && nPos >= 0) {
                if (tempArr[mPos] > nums2[nPos]) {
                    nums1[i] = tempArr[mPos];
                    mPos--;
                } else {
                    nums1[i] = nums2[nPos];
                    nPos--;
                }
            } else if (mPos >= 0) {
                nums1[i] = tempArr[mPos];
                mPos--;
            } else if (nPos >= 0) {
                nums1[i] = nums2[nPos];
                nPos--;
            }
        }
    }
}
