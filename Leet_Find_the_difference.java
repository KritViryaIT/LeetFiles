class Solution {
    public char findTheDifference(String s, String t) {
        
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();

        Arrays.sort(S);
        Arrays.sort(T);

        // int l1 = S.length;
        // int l2 = T.length;
        int i=0;

        while(i < l1 && i <= l2){

            if(S[i] != T[i]){

                break;
            }

            i++;
        }

        return T[i];
    }
}
