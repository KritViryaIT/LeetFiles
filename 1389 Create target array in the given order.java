class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList<Integer> arrl = new ArrayList<>();
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
            arrl.add(index[i], nums[i]);

        for (int i = 0; i < arrl.size(); i++)
        {
            target[i] = arrl.get(i);
        }
        return target;
    }
}

// space complexity can be improved.........
