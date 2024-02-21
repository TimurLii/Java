package Task.Task_10_20;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3,0,0,0};
        int[] arr2 = new int[]{2, 5, 6};
        int lenArr1 = 3;
        int lenArr2 = arr2.length;
        merge(arr1, lenArr1, arr2, lenArr2);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] arrCopy = new int[n + m];
        System.arraycopy(nums1, 0, arrCopy, 0,nums1.length);
        System.arraycopy(nums2, 0, arrCopy, nums2.length , nums2.length);
        Arrays.sort(arrCopy);
        System.out.println(Arrays.toString(arrCopy));
//        for (int j = 0, i = m; j < n; j++) {
//            nums1[i] = nums2[j];
//            i++;
//        }
//        Arrays.sort(nums1);
//        System.out.println(Arrays.toString(nums1));
    }
}



