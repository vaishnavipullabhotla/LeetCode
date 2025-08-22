class Solution 
{
    public int[] sumZero(int n) 
    {
        int res[] = new int[n];
        int num = 1;
        for(int i=0;i<n/2;i++)
        {
            res[i] = num;
            res[n-1-i] = -num;
            num++;
        }
        return res;
    }
}