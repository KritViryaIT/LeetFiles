class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int l = flowerbed.length;
        int i = 0;
        if(n == 0)
            return true;
        if(l < n)
            return false;
        if(l == 1 && flowerbed[0] == 0)
            return true;
        if(l == 1 && flowerbed[0] == 1)
            return false;
        if(flowerbed[0] == 0 && flowerbed[1] == 0)
        {
            n--;
            flowerbed[0] = 1;
        }
        if(flowerbed[l-1] == 0 && flowerbed[l-2] == 0)
        {
            n--;
            flowerbed[l-1] = 1;
        }

        if(n <= 0)
            return true;

        for(i=1; i<l-2;)
        {
            if(flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i-1] == 0)
            {
                    n--;
                    i += 2;
                    if(n == 0)
                        return true;
            }   
            else
            {
                i += 1;
            }
            
        }

        return false;

    }
}