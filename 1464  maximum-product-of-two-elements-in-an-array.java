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

// Need to improve memory........

//  ------------- Improved Solution  -------------  

class Solution {
    public int maxProduct(int[] nums) {
        
        for (int i = 2; i < nums.length; i++)
        {
            if (nums[i] >= nums[1] || nums[i] >= nums[0] && nums.length > 2 )
            {
                nums[0] = Math.max(nums[0], nums[1]);
                nums[1] = nums[i];
            }

        }
        return (nums[0]-1)*(nums[1]-1);
    }
}
