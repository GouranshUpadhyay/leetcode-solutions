class Solution {
    public boolean check(int[] nums) {
       int Piv=0;
       int count=0;
       int ans=0;
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]>nums[i+1]){
            ans++;
            Piv=i+1;
            count++;
        }
       }
       if(ans==0) return true;
       if(count>1) return false;
       
        for(int j=Piv;j<nums.length;j++){
            if(nums[0]<nums[j]){
                return false;
            }
        }
        return true;
    }
}