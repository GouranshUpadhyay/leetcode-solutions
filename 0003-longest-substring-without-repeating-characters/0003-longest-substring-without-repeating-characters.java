// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         HashMap<Character,Integer> map=new HashMap<>();
//         int left=0;
//         int ans=0;
//         for( int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(map.containsKey(ch)){
//                 left=Math.max(left,map.get(ch)+1);
//             }
//             map.put(ch,i);
//             ans=Math.max(ans,i-left+1);
//         }
//         return ans;
//     }
// }


class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] arr=new boolean[128];
        int left=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(arr[ch]){
                arr[s.charAt(left)]=false;
                left++;
            }
            arr[ch]=true;
            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}


