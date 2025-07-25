class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int n=nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int complement = target-nums[i];
            if(hm.containsKey(complement))
            return new int[]{hm.get(complement),i};
            else
            hm.put(nums[i],i);
        }
        return new int[]{};
    }
}