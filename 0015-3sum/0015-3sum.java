class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n-1;i++)
        {
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
                    List<Integer> list = Arrays.asList(nums[i],nums[l],nums[r]);
                    //this method is used to add directly numbers as a list
                    set.add(list);
                    l++;
                    r--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}