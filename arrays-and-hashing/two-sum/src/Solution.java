import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static ArrayList<Integer> twoSum(int[] nums, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> intToIdxMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                continue;
            }
            if (intToIdxMap.containsKey(target - nums[i])) {
                result.add(intToIdxMap.get(target - nums[i]));
                result.add(i);
            }
            intToIdxMap.put(nums[i], i);
        }
        return result;
    }
}