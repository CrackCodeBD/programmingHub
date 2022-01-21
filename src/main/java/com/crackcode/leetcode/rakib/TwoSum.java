package com.crackcode.leetcode.rakib;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*https://leetcode.com/problems/two-sum/*/
public class TwoSum {

    private int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int exp = target - nums[i];
            if (map.containsKey(exp)) {
                result[0] = map.get(exp);
                result[1] = i;
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("There is no value to show");
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(new TwoSum().twoSum(intArray, 13)));
    }
}
