class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
}