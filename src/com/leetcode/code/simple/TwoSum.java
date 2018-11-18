package com.leetcode.code.simple;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int index1 = 0;
        int index2 = 0;

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int n1 = nums[i];
            for (int j = i + 1; j < len; j++) {
                int n2 = nums[j];
                if (target == n1 + n2) {
                    index1 = i;
                    index2 = j;
                    break;
                }
            }
        }

        return new int[]{index1, index2};
    }
}