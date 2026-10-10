class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int maxDiff = 0;
        long totalDiff = 0;
        int[] diff = new int[n];
        
        // Calculate absolute differences and find the max difference
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            totalDiff += diff[i];
            maxDiff = Math.max(maxDiff, diff[i]);
        }
        
        long k = (long) k1 + k2;
        
        // If we have enough operations to reduce all differences to 0
        if (totalDiff <= k) {
            return 0;
        }
        
        // Count frequencies of each difference (Bucket Sort approach)
        int[] count = new int[maxDiff + 1];
        for (int i = 0; i < n; i++) {
            count[diff[i]]++;
        }
        
        // Greedily reduce the largest differences
        for (int i = maxDiff; i > 0 && k > 0; i--) {
            if (count[i] > 0) {
                long take = Math.min((long) count[i], k);
                
                count[i] -= take;
                count[i - 1] += take;
                k -= take;
            }
        }
        
        // Calculate the final sum of squared differences
        long result = 0;
        for (int i = 1; i <= maxDiff; i++) {
            if (count[i] > 0) {
                result += (long) count[i] * (long) i * i;
            }
        }
        
        return result;
    }
}