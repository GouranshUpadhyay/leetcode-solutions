class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int freq[]=new int[26];
        List<Integer> ans =new ArrayList<>();
        if(p.length()>s.length()) {
            return ans;
        }
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }
        for(int i=0;i<p.length();i++){
            freq[s.charAt(i)-'a']--;
        }
        if(allzero(freq)){
            ans.add(0);
        }
        for( int right=p.length();right<s.length();right++){
            freq[s.charAt(right)-'a']--;
            int left=right-p.length();
            freq[s.charAt(left)-'a']++;
            if(allzero(freq)){
                ans.add(left+1);
            }
        }
        return ans;
    }
    public boolean allzero(int[] freq){
        for(int num:freq){
            if(num!=0) return false;
        }
        return true;
    }
}