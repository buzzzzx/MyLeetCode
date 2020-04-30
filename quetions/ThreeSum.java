package quetions;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> uniqueThree = new HashSet<>();
        for (int i = 0; i < nums.length; i += 1) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    uniqueThree.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j += 1;
                    k -= 1;
                } else if (sum > 0) {
                    k -= 1;
                } else {  // sum < 0;
                    j += 1;
                }
            }
        }

        return new ArrayList<>(uniqueThree);
    }

    // This one is faster
    public List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i += 1) {
            if ((i == 0) || (i > 0 && nums[i] != nums[i - 1])) {
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j + 1]) {
                            j += 1;
                        }
                        while (j < k && nums[k] == nums[k - 1]) {
                            k -= 1;
                        }
                        j += 1;
                        k -= 1;
                    } else if (sum > 0) {
                        k -= 1;
                    } else {  // sum < 0;
                        j += 1;
                    }
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ThreeSum ts = new ThreeSum();
        List<List<Integer>> res = ts.threeSum(nums);
    }

}
