lass Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
        {
            int count = 0;


            for (int j = 0; j < nums.length; j++)
            {
                if (i == nums.length - 1 && j == i )
                {
                    break;
                }
                
                else if (j == i)
                {
                    ++j;
                }

                if (nums[j] < nums[i])
                {
                    count++;
                }
            }

            ans[i] = count;
        }
        return ans;
    }
}
