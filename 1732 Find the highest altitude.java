class Solution {
    public int largestAltitude(int[] gain) {

        int[] alt = new int[gain.length+1];
 
        for (int i=0; i < gain.length; i++)
            alt[i+1] = alt[i]+gain[i];

        int max = Integer.MIN_VALUE;

        for (int i=0; i < alt.length; i++)       
            if (max < alt[i]) max = alt[i];

        return max < 0 ? 0 : max;
    }
}


// Need to improve Memory............
