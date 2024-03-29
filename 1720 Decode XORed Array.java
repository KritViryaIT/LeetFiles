class Solution {
    public int[] decode(int[] encoded, int first) {
        
        int n = encoded.length;
        int[] dec = new int[n + 1];
        dec[0] = first;
        for(int i = 1; i <= n; i++){
            dec[i] = (encoded[i - 1] ^ dec[i - 1]);     // ' ^ ' This is used to do bitwise exclusive OR (XOR) operations
        }
        return dec;
    }
}

// Need to improve Space Complexity........
