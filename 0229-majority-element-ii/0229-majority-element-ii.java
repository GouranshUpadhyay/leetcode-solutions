class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> major=new ArrayList<>();
        int candidate1=0 ,candidate2=0;
        int count1=0,count2=0;
        for(int num:nums){
             if(candidate1==num){
                count1++;
            }
               else if(candidate2==num){
                count2++;
            }
            else if(count1==0){
                candidate1=num;
                count1++;
            }
           
            else if(count2==0){
                candidate2=num;
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        int x=0,y=0;
        for(int n:nums){
            if(n==candidate1) x++;
            else if(n==candidate2) y++;
        }
        if(x>nums.length/3) major.add(candidate1);
        if(y>nums.length/3) major.add(candidate2);
        return major;
        }   
    }
