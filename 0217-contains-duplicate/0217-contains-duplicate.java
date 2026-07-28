import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;

        for (int i = 0; i < n; i++) {

            int j = i + 1;

            if (j < n && nums[i] == nums[j]) {
                return true;
            }
        }

        return false;
    }
}