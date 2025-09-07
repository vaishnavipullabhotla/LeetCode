class Solution 
{
    public int maxProductDifference(int[] nums) 
    {
        Arrays.sort(nums);
        int n = nums.length;
        int large = nums[n-1]*nums[n-2];
        int small = nums[0]*nums[1];
        return large - small;
    }
}