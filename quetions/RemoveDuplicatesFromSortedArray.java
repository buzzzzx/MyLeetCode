package quetions;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i += 1) {
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j += 1;
            }
        }

        return j;
    }
}
