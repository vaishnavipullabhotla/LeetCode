class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        //Optimal
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n-1;i++)
        {
            if(i>0 && nums[i-1]==nums[i])
            continue;
            int l=i+1,r=n-1;
            while(l<r)
            {
                int sum = nums[i]+nums[l]+nums[r];
                if(sum<0)
                l++;
                else if(sum>0)
                r--;
                if(sum==0)
                {
                    while(l<r && nums[l]==nums[l+1])
                    l++;
                    while(l<r && nums[r-1]==nums[r])
                    r--;
                    list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    //this method is used to add directly numbers as a list
                    l++;
                    r--;
                }
            }
        }
        return list;
    }
}