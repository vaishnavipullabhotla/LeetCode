class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int a[]=new int[]{-1,-1};
        while(l<=r){
            if(nums[l]!=target)
            l++;
            else a[0]=l;
            if(nums[r]!=target)
            r--;
            else a[1]=r;
            if(a[0]!=-1 && a[1]!=-1)
            break;
        }
        return a;
    }
}