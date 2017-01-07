package com.kode.leetcode;

import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int[] test = nums;
        Arrays.sort(test);
        if (target < test[0]) {
            return result;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 4, 3},6);
        System.out.println(result);
    }
}