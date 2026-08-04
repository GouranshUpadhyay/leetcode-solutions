// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {
//         Arrays.sort(nums);

//         List<Integer> ans = new ArrayList<>();

//         for(int i=1;i<nums.length;i++){

//             int prev = nums[i-1];
//             int curr = nums[i];

//             while(prev+1 < curr){
//                 ans.add(prev+1);
//                 prev++;
//             }
//         }

//         return ans;
//     }
// }


// optimal 


class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = min + 1; i < max; i++) {
            if (freq[i] == 0) {
                ans.add(i);
            }
        }

        return ans;
    }
}


