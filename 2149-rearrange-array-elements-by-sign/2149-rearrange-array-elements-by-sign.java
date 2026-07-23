// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int z=0;
//         int x=0;
//         int n=nums.length;
//         int[] a=new int[n/2];
//         int[] b=new int[n/2];
//         int[] ans=new int[n];
//         for(int i=0;i<n;i++){
//             if(nums[i]>0){
//                 a[z]=nums[i];
//                 z++;
//             }
//             else { 
//                 b[x]=nums[i]; 
//                 x++;
//             }
//         }
//         for(int j=0;j<n/2;j++){
//             ans[2*j]=a[j];
//             ans[2*j+1]=b[j];
//         }
//         return ans;
//     }
// } 
 

// Best aproch;

class Solution {
     public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int i=0;
        int j=1;
        for(int num:nums){
            if(num>0){
                ans[i]=num;
                i+=2;
            }
            else {
                ans[j]=num;
                j+=2;
            }
        }
        return ans;
    }
 }  