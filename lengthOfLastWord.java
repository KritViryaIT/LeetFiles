class Solution {
    public int lengthOfLastWord(String s) 
    {
        
        s=s.trim();

        char ch = ' ';

        int pos = s.lastIndexOf(ch);
        if(pos == -1)
            return s.length();

        String x = s.substring(pos, s.length()-1);

        return x.length();
        
    }
}