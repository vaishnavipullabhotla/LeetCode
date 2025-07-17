class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k=nums.length;
        int temp[]=new int[n];
        int idx=0;
        for(int i=n;i<k;i++)
        temp[idx++]=nums[i];
        int dummy[]=new int[k];
        idx=0;
        for(int i=0;i<n;i++){
            dummy[idx++]=nums[i];
            dummy[idx++]=temp[i];
        }
        return dummy;
    }
}