package quetions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> solution(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i += 1) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j =  i + 1; j < nums.length - 2; j += 1) {
                if (j != i + 1 && nums[j] == nums[j-1]) {
                    continue;
                }
                int low = j + 1;
                int high = nums.length - 1;

                while (low < high) {
                    int sum = nums[i] + nums[j] + nums[low] + nums[high];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        while(low < high && nums[low] == nums[low+1]) {
                            low += 1;
                        }
                        while(low < high && nums[high] == nums[high-1]) {
                            high -= 1;
                        }

                        low += 1;
                        high -= 1;
                    } else if (sum > target) {
                        high -= 1;
                    } else {
                        low += 1;
                    }
                }
            }
        }

        return res;
    }
}
