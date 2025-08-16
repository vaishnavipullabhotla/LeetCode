class Solution 
{
    public boolean isPowerOfFour(int n) 
    {
        for(int i=0;i<n;i++)
        {
            long pow = (long)Math.pow(4,i);
            if(n == pow)
            return true;
            if(pow > n)
            break;
        }
        return false;
    }
}