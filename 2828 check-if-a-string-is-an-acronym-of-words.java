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

// Need to improve the on time complexity...........
