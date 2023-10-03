class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max = 0;

        for (String s : sentences)
        {
            char ch[]= new char[s.length()];
            int count = 0;

            for(int i=0; i < s.length(); i++)  
            {  
                ch[i]= s.charAt(i);

                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++;  
            }

            if (count > max)
                max = count;  
        }

        return max;
    }
}

/*          Shorter Way but not optimal too much time and space complexity

    class Solution {
    public int mostWordsFound(String[] sentences) {

    int max = 0;

        for (String s : sentences)
            max = Math.max(max, s.split("\\s").length;

        return max;
        }
    }

*/
