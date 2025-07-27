class Solution 
{
    public int countHillValley(int[] nums) 
    {
        int n = nums.length;
        int cnt = 0;
        for(int i=1;i<n-1;i++)
        {
            if(nums[i]==nums[i-1]) continue;
            int p = i+1;
            int q = i-1;
            while(p<n && nums[p]==nums[i]) p++;
            while(q>=0 && nums[q]==nums[i]) q--;
            if(q>=0 && p<n){
                if(nums[i]>nums[q] && nums[i]>nums[p])
                cnt++;
                else if(nums[i]<nums[q] && nums[i]<nums[p])
                cnt++;
            }
        }
        return cnt;
    }
}