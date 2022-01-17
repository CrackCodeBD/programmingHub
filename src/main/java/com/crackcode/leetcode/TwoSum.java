package com.crackcode.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {//[2,7,11,15] , target = 9
        Map<Integer, Integer> m = new HashMap<>();
        int [] result = new int[2];
        for(int i=0; i < nums.length; i++){  // 1
            int exp = target - nums[i]; // 9-7 = 2
            if(m.containsKey(exp)){
                result[0] = i;
                result[1] = m.get(exp);
                return result;
            }else{
                m.put(nums[i], i); // key, value 2, 0
            }
        }
        return result;
    }
}
