class Solution {
    public String interpret(String command) {
        
        String s = "";

        for (int i = 0; i < command.length(); i++)
        {
            if (command.charAt(i) == 'G')
                s += "G";
            
            else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')')
           {
                s += "o";
                i++;
            }

            else if (command.charAt(i) == '(' && command.charAt(i + 3) == ')')
            {
                s += "al";
                i += 3;
            }
        }

        return s;
    }
}

// ----------------- 2nd Approach -----------------

class Solution {
    public String interpret(String command) {
        
        StringBuilder s = new StringBuilder(command.length());
