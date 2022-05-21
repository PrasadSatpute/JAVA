package com.Solution.leetcode;

import java.util.Arrays;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        int arrResult[] = {0, 0};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    sum = nums[i] + nums[j];
                    if (sum == target) {
                        arrResult[0] = i;
                        arrResult[1] = j;
                        return arrResult;
                    }
                }
            }
        }
        return arrResult;
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Solution s = new Solution();
        int nums[] = {2,7,11,15};
        int[] sumArray = s.twoSum(nums, 9);
        System.out.println(Arrays.toString(sumArray));
    }
}
