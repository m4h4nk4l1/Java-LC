package Leetcode;

public class Merge_sorted_array {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] MergedArr = new int[m+n];
            for(int i = 0; i<=m; i++) MergedArr[i] = nums1[i];
            System.out.println(MergedArr);
        }
}
