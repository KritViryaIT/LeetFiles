class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int[] ans = {-1,-1};

        if (nums.length == 1 && nums[0] == target)
        {
            int[] ans2 = {0,0};
            return ans2;
        }

        for (int i = 0; i < nums.length; i++)
        {
            if ( nums[i] == target)
            {