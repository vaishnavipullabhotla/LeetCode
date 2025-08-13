class Solution 
{
    public int smallestIndex(int[] nums) 
    {
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int k = nums[i];
            int sum = 0;
            while(k>0)
            {
                int d = k%10;
                sum += d;
                k = k/10;
            }
            if(sum == i)
            return sum;
        }
        return -1;
    }
}