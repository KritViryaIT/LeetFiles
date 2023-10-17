class Solution {
    public int balancedStringSplit(String s) {
        
        int count = 0, countL = 0, countR = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
                countR++;
            else
                countL++;
            if(countR==countL)
                count++;
        }
        return count;
    }
}
