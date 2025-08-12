class Solution 
{
    public boolean canAliceWin(int[] nums) 
    {
        int n = nums.length;
        int cntSingle = 0, cntDouble = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] > 9)
            cntDouble += nums[i];
            else
            cntSingle += nums[i];
        }
        if(cntSingle > cntDouble || cntDouble > cntSingle)
        return true;
        return false;
    }
}