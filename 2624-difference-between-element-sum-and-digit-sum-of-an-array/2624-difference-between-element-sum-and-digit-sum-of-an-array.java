class Solution 
{
    public int differenceOfSum(int[] nums) 
    {
        int n = nums.length;
        int sum1 = 0, sum2 = 0, d = 0;
        for(int i=0;i<n;i++)
        {
            sum1 += nums[i];
            int k = nums[i];
            while(k > 0)
            {
                d = k%10;
                sum2 += d;
                k = k/10;
            }
        }
        return Math.abs(sum1 - sum2);
    }
}