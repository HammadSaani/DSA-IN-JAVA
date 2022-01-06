package SortingAlgo.test;

import java.util.Arrays;

class GroceryList2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        Solution.rotate(nums, k);
    }
}
class Solution {
    static public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int i=0; i < nums.length; i++){
            temp[i] = nums[i];
        }


        for (int i=0; i < nums.length; i++){
            nums[(i + k)%nums.length] = temp[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}