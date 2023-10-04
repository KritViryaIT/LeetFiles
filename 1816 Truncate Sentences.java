class Solution {
    public String truncateSentence(String s, int k) {
        
        int count = 0;
        String s2 = "";
        for (int i = 0; i < s.length(); i++)
        {   
            if (s.charAt(i) == ' ')
                count++;

            if (count == k)
                break;

            s2 += s.charAt(i);
            
        }

        return s2;
    }
}

// Above is one of the most basic approach.....

// ---------------------- Optimised ----------------------

class Solution {
    public String truncateSentence(String s, int k) {
        
        int count = 0;
        
        for (int i = 0; i < s.length(); i++)
        {   
            if (s.charAt(i) == ' ')
                count++;

            if (count == k)
                return s.substring(0,i);
            
        }

        return s;
        
    }
}
