class Solution 
{
    public int minSubArrayLen(int target, int[] nums) 
    {
        int n = nums.length;
        int l = 0, sum = 0, min = Integer.MAX_VALUE;
        for(int r=0;r<n;r++)
        {
            sum += nums[r];
            while(sum >= target)
            {
                min = Math.min(min,r-l+1);
                sum -= nums[l++];
            }
        }
        if(min == Integer.MAX_VALUE) return 0;
        return min;
    }
}