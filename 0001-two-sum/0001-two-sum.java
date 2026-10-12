class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
        int curr=nums[i];
        int comp=target-curr;
        if(map.containsKey(comp)){
            return new int[]{
                map.get(comp),i
            };
        }
        map.put(curr,i);
       }
       return new int[]{-1,-1};
    }
}