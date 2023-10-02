class Solution {
    public boolean winnerOfGame(String colors) 
    {
        int a = 0, b = 0;

        if (colors.length() < 3)
            return false;

        for (int i = 1; i < colors.length() - 1;i++)
        {
          if (colors.charAt(i) == 'A')
          {
          if (colors.charAt(i - 1)  == 'A' && colors.charAt(i + 1)  == 'A')
            a++;
          }

          else if (colors.charAt(i) == 'B')
          {
          if (colors.charAt(i - 1)  == 'B' && colors.charAt(i + 1)  == 'B')
            b++;
          }
        }

        if (b >= a )
          return false;

        else
          return true;
        
    }
}
