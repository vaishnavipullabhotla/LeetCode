class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int k=1;
        for(int i=0;i<n;i++){
            if(k==nums[i])
            k++;
        }
        return k;
    }
}