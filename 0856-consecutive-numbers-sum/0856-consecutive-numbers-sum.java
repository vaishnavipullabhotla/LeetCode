class Solution 
{
    public int consecutiveNumbersSum(int n) 
    {
        int cnt = 0;
        //formula: x = (num-(n(n-1)/2))/n
        for(int i=1;i*(i+1)/2<=n;i++)
        {
            int numerator = (n-(i*(i-1)/2));
            if(numerator % i == 0)
            {
                // int x = numerator/i;
                // if(x > 0)
                cnt++;
            }
        }
        return cnt;
    }
}