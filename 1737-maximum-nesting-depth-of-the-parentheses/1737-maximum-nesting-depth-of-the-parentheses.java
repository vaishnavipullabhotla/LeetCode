class Solution 
{
    public int maxDepth(String s) 
    {
        int cnt = 0, max = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                cnt++;
                max = Math.max(max,cnt);
            }
            else if(ch == ')')
            {
                cnt--;
            }
        }
        return max;
    }
}