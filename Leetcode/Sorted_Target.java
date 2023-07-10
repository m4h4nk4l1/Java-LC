package Leetcode;

public class Sorted_Target {
    public static void main(String[] args) {
        int[] result = Sorted_Target.find(new int[] {1, 2, 3, 4, 5, 6}, 6);
        System.out.println(" output is : [" + result[1]  + result [2] + "]");
    }
    public static int[] find(int[] arr, int target){
        int left =0; int right = arr.length - 1;
        while(left < right){
            int currentSum = arr[left] + arr[right];
            if(currentSum == target){
                return new int[] {left, right};
            }
            if(target > currentSum){
                left++;
            }
            else right--;
        }
        return new int[] {-1 ,-1};
    }
}
