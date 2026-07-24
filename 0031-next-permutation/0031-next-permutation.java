class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int piv = -1;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                piv = i - 1;
                break;
            }
        }
        if (piv == -1) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            return;
        }
        int j = n - 1;
        while (nums[j] <= nums[piv]) {
            j--;
        }
        int temp = nums[piv];
        nums[piv] = nums[j];
        nums[j] = temp;

        int left = piv + 1;
        int right = n - 1;

        while (left < right) {
            int temp1 = nums[left];
            nums[left] = nums[right];
            nums[right] = temp1;
            left++;
            right--;
        }
    }
}