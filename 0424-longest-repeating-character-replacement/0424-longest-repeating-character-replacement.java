class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0;
        int maxfreq=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'A']++;
            maxfreq=Math.max(maxfreq,freq[ch-'A']);
            int windowsize=i-left+1;
            if(windowsize-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}