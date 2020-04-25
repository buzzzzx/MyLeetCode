package quetions;

import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public static int[] solution(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        int i;
        for (i = 0; i < nums.length; i += 1) {
            if (numIndexMap.containsKey(nums[i])) {
                res[0] = numIndexMap.get(nums[i]);
                res[1] = i;
                return res;
            }
            numIndexMap.put(target - nums[i], i);
        }

        return res;
    }
}