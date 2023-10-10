class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int count=Integer.MAX_VALUE,j=1,dup=0;
        int[] dupArr = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
