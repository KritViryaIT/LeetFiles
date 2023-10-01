class Solution {
    public int maximumWealth(int[][] accounts) {

        int large = accounts[0][0];

        for(int customer[] : accounts){

            int Sum = 0;
            
            for(int bank : customer)
                Sum += bank;

            large = Math.max(large, Sum);
        }
        return large;
    }
}

// Need to better memmory
