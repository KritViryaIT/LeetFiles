class Solution {
    public void moveZeroes(int[] nums) {
        
        int count = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                nums[count++] = nums[i];
            }
        }

        while (count < nums.length)
        {
            nums[count++] = 0;
        }

        System.out.println(nums);
    }
}

// too slow and memory hungry,  need to improve  ......... 
