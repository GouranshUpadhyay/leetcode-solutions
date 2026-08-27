class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length-1;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double avg=(double) sum/k;
        double ans=avg;
        for(int i=k-1;i<n;i++){
            sum=sum-nums[i-(k-1)]+nums[i+1];
            double newavg=(double) sum/k;
            ans=Math.max(ans,newavg);
        }
        return ans;
    }
}