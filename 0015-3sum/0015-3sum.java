class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        //Brute Force
        // Set<List<Integer>> s=new HashSet<>();
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             List<Integer> t=new ArrayList<>();
        //             if(nums[i]+nums[j]+nums[k]==0)
        //             {
        //                 t.add(nums[i]);
        //                 t.add(nums[j]);
        //                 t.add(nums[k]);
        //                 Collections.sort(t);
        //                 s.add(t);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(s);
        //TLE TC O(N3)
        //Better
        // List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            Set<Integer> vis = new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int k = -(nums[i]+nums[j]);
                if(vis.contains(k))
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(k);
                    Collections.sort(list);
                    set.add(list);
                }
                vis.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}