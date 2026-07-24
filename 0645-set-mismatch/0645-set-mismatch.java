class Solution {
    public int[] findErrorNums(int[] nums) {
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
        int[] ans=new int[2];
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                ans[0]=nums[j];
                ans[1]=j+1;
            }
        }
        return ans;
    }
}