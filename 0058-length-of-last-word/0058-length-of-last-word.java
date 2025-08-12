class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        int n = s.length();
        int cnt = 0;
        for(int i=n-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            if(ch != ' ')
            cnt++;
            else if(ch == ' ' && cnt != 0)
            break;
        }
        return cnt;
    }
}