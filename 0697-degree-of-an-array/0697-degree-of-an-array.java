class Solution 
{
    public int findShortestSubArray(int[] nums) 
    {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashMap<Integer,Integer> first = new HashMap<>();
        HashMap<Integer,Integer> last = new HashMap<>();
        int max = 0, min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(!first.containsKey(nums[i]))
            first.put(nums[i],i);
            last.put(nums[i],i);
            max = Math.max(max,hm.get(nums[i]));
        }
        for(int key:hm.keySet())
        {
            if(hm.get(key) == max)
            {
                int length = last.get(key)-first.get(key)+1;
                min = Math.min(min,length);
            }
        }
        return min;
    }
}