class Solution 
{
    public int countEven(int num) 
    {
        int cnt = 0;
        for(int i=1;i<=num;i++)
        {
            int k = i;
            int sum = 0;
            while(k > 0)
            {
                int d = k % 10;
                sum += d;
                k = k/10;
            }
            if(sum % 2 == 0)
            cnt++;
        }
        return cnt;
    }
}