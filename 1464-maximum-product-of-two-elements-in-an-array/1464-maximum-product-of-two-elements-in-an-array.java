class Solution {
    public int maxProduct(int[] nums) {
        int product1=0;
        int product2=0;
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
         int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int num:nums){
            if(max1<num){
                max2=max1;
                max1=num;
            }
            else if(max2<num){
                max2=num;
            }
        }
        for(int n:nums){
            if(min1>n){
                min2=min1;
                min1=n;
            }
            else if(min2>n){
                min2=n;
            }
        }
        product1=(max1-1)*(max2-1);
        product2=(min1-1)*(min2-1);
        return Math.max(product1,product2);
    }
  
}