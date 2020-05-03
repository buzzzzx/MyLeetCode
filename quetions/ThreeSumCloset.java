package quetions;

import java.util.Arrays;

public class ThreeSumCloset {
    public int solution(int[] nums, int target) {
        Arrays.sort(nums);
        int closet = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < nums.length - 2; i += 1) {
            int low = i + 1;
            int high = nums.length - 1;

            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (Math.abs(target - sum) < closet) {
                    closet = Math.abs(target - sum);
                    res = sum;
                }

                if (sum < target) {
                    low += 1;
                } else if (sum > target) {
                    high -= 1;
                } else {
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ThreeSumCloset tsc = new ThreeSumCloset();
        int[] input = {1, 1, -1, -1, 3};
        int res = tsc.solution(input, -1);
    }
}
