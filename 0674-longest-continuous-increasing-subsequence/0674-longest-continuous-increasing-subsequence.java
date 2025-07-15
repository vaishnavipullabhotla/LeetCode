class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        if(n<=1)
        return nums[0];
        int cnt=1,max=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                cnt++;
            }
            else{
                cnt=1;
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}