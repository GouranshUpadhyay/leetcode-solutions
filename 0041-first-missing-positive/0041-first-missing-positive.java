class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int ans=0;
        int i=0;
        while(i<n){
            int corr=nums[i]-1;
            if(nums[i]>0 && nums[i]<n && nums[i]!=nums[corr]){
                int temp=nums[i];
                nums[i]=nums[corr];
                nums[corr]=temp;
            }
            else i++;
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return n+1;
    }
}