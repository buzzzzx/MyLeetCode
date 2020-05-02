package quetions;

public class RemoveElements {
    public int solution(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i += 1) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count += 1;
            }
        }
        return count;
    }
}
