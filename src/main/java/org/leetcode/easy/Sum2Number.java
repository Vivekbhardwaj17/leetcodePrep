package org.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Sum2Number {
    public static int[] twoSumApproach1(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }

    public static int[] twoSumApproach2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = twoSumApproach1(arr,target);
        Arrays.stream(ans).forEach(System.out::print);
    }
}
