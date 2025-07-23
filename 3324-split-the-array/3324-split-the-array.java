class Solution 
{
    public boolean isPossibleToSplit(int[] nums) 
    {
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int cnt = 0;
            for(int j=i;j<n;j++)
            {
                if(nums[i]==nums[j])
                cnt++;
                if(cnt>2)
                return false;
            }
        }
        return true;
    }
}