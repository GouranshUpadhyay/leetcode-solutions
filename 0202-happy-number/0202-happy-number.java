class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast!=1){
            slow=sum(slow);
            fast=sum(sum(fast));
            if(fast==slow) break;
        }
        return fast==1;
    }
    public int sum(int number){
            int ans=0;
            while(number>0)
            {
            int rem=number%10;
            ans+= rem*rem;
            number=number/10;
            }
        return ans;
        }
}