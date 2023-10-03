class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
        {
            int l = 0, r = 0;
            
            for (int j = 0; j < nums.length; j++)
            {
                if (j > i)
                    r += nums[j];

                else if (j < i)
                    l += nums[j];

                else if (i == 0)
                    l = 0;

                else if (i == nums.length - 1)
                    r = 0;
            }

            ans[i] = l - r;

            if (ans[i] < 0)
                ans[i] = 0 - ans[i];

        }

        return ans;
    }
}

// Works but both the complexities high | Not optimal
