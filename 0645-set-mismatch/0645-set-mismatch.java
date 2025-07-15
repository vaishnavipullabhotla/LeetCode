class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int a[]=new int[2];
        for(int i=1;i<=n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(nums[j]==i)
                cnt++;
            }
            if(cnt==2)
            a[0]=i;
            // if(nums[i-1]!=i)
            if(cnt==0)
            a[1]=i;
        }
        return a;
    }
}