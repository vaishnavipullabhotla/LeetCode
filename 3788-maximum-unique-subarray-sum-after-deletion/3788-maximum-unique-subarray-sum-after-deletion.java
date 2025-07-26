class Solution {
    public int maxSum(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0,max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max = Math.max(max,nums[i]);
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                if(nums[i]>0)
                sum += nums[i];
            }
        }
        if(n==1) return nums[0];
        if(sum==0) return max;
        return sum;
    }
}