class Solution 
{
    public double minimumAverage(int[] nums) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        int l=0,r=n-1;
        int min=Integer.MAX_VALUE,max=0;
        double avgMin=Integer.MAX_VALUE;
        while(l<r)
        {
            int sum=0;
            min=nums[l];
            max=nums[r];
            double avg=(min+max)/2.0;
            avgMin=Math.min(avgMin,avg);
            l++;
            r--;
        }
        return avgMin;
    }
}