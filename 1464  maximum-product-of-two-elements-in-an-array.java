class Solution {
    public int maxProduct(int[] nums) {
       
        int a = nums[0], b = nums[1];
        for (int i = 2; i < nums.length; i++)
        {
            if (nums[i] >= b || nums[i] >= a && nums.length > 2 )
            {
                a = Math.max(a, b);
                b = nums[i];
            }

        }

        return (a-1)*(b-1);
    }
}
