class Solution 
{
    public int countDigits(int num) 
    {
        int x = num;
        int cnt = 0;
        while(x>0)
        {
            int k = x%10;
            if(num%k==0)
            cnt++;
            x = x/10;
        }
        return cnt;
    }
}