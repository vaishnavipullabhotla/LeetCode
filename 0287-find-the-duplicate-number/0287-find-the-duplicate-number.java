class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        int l=0,r=l+1;
        while(l<r)
        {
            if(nums[l]==nums[r])
            return nums[l];
            l++;
            r++;
        }
        return 0;
    }
}