class Solution 
{
    public int findFinalValue(int[] nums, int original) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(nums[i] == original)
            original = original*2;
        }
        return original;
    }
}