class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int max = findGreatest(candies);
        List<Boolean> result = new ArrayList<Boolean>();
        
        for(int i = 0; i<candies.length; i++)
        {
            if((candies[i] + extraCandies)<max)
                result.add(false);
            else
                result.add(true);
        } 
        return result;
        
    }

    private int findGreatest(int[] n)
    {
        int greatest = n[0];
        for(int i = 1; i< n.length; i++)
        {
            if(n[i]>greatest)
                greatest = n[i];
        }

        return greatest;
    }
}