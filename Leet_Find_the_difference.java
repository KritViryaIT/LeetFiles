class Solution {
    public char findTheDifference(String s, String t) {
        
        char[] s2 = s.toCharArray();
        char[] t2 = t.toCharArray();

        Arrays.sort(S);
        Arrays.sort(T);

        // int l1 = s2.length;
        // int l2 = t2.length;
        int i=0;

        while(i < s2.length && i <= t2.length){

            if(S[i] != T[i]){

                break;
            }

            i++;
        }

        return T[i];
    }
}
