class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String s1 = "", s2 = "";

        for (String s : word1)
            s1 += s;

        for (String s : word2)
            s2 += s;

        return s1.equals(s2);
    }
}

// memory hungry

// ---------------------- Another Better Approach ---------------------- 

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        for (int i = 1; i < word1.length; i++)
            word1[0] += word1[i];

        for (int i = 1; i < word2.length; i++)
            word2[0] += word2[i];

        return word1[0].equals(word2[0]);
    }
}
