class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) arrSize += nums[i];
