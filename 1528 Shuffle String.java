class Solution {
    public String restoreString(String s, int[] indices) {
        
        StringBuilder sb = new StringBuilder("");
        char  ch[]  = new char[s.length()];

        for (int i = 0; i < s.length(); i++)
            ch[indices[i]] = s.charAt(i);
        
        sb.append(ch);
        return sb.toString();
    }
}

// --------------- Another Method --------------

class Solution {
    public String restoreString(String s, int[] indices) {
        
        char  ch[]  = new char[s.length()];

        for (int i = 0; i < s.length(); i++)
            ch[indices[i]] = s.charAt(i);
        
        return String.valueOf(ch);
    }
}
