class Solution {
    public boolean isAcronym(List<String> words, String s) {
        
        String s2 = "";
        for (String a : words)
        {
            s2 += a.charAt(0);
        }
        if (s2.equals(s)) return true;
        else return false;
    }
}

// ------------------    Optimal Solution    ------------------

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        
        StringBuilder nm=new StringBuilder();
        for(int i=0;i<words.size();i++)
        {
            nm.append(words.get(i).charAt(0));
        }
        return nm.toString().equals(s);
    }
}

