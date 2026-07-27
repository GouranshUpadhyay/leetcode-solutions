// find the first three max element thren the first two minium
// then return maximum of (max1,max2,max3) or (max1,min1,min2)

class Solution {
    public int maximumProduct(int[] nums) {
        int maxproduct1=0;
        int maxproduct2=0;
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int num:nums){
            if(num>max1){
                max3=max2;
                max2=max1;
                max1=num;
            }
            else if(num>max2){
                max3=max2;
                max2=num;
            }
            else if(num>max3){
                max3=num;
            }
        }
        maxproduct1=(max1*max2*max3);
        for(int n:nums){
            if(n<min1){
                min2=min1;
                min1=n;
            }
            else if(n<min2){
                min2=n;
            }
        }
        maxproduct2=(max1*min1*min2);
        return Math.max(maxproduct1,maxproduct2);
    }
}