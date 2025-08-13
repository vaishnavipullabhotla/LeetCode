class Solution 
{
    public int minimumOperations(int[] nums) 
    {
        int n = nums.length;
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]%3 == 0)
            continue;
            else if((nums[i]-1) % 3 == 0)
            cnt++;
            else if((nums[i]+1) % 3 == 0)
            cnt++;
        }
        return cnt;
    }
}