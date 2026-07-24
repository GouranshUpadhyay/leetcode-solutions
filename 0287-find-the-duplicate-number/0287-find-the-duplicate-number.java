class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            int corr=nums[i]-1;
            if(nums[i]!=nums[corr]){
                int temp=nums[i];
                nums[i]=nums[corr];
                nums[corr]=temp;
            }
            else i++;
        }
        int ans=0;
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                ans=nums[j];
            }
        }
        return ans;
    }
}