/*
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

*/

//                         optimal solution

class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];

        for ( int i = 1; i < nums.length; i++)
            l[i] = l[i-1] + nums[i - 1];

        for (int i = nums.length - 2; i >=0; i--)
            r[i] = r[i + 1] + nums[i + 1];

        for (int i = 0; i < nums.length; i++)
            nums[i] = Math.abs(l[i] - r[i]);

        return nums;
    }
}


