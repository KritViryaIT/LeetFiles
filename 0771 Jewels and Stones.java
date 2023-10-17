class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        List<String> jlist = new ArrayList<String>(Arrays.asList(jewels.split("")));
        List<String> slist = new ArrayList<String>(Arrays.asList(stones.split("")));

        int count = 0;
        for (String j : jlist)
        {
            for (String s : slist)
            {
                if (j.equals(s))
                    count++;
            }
        }

        return count;
    }
}

// --------------------- 2nd Approach ---------------------

class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int count = 0;
        for (int i = 0; i < jewels.length(); i++)
        
            for (int j = 0; j < stones.length(); j++)
            
                if (jewels.charAt(i) == stones.charAt(j))
                    count++;

        return count;
    }
}    
