class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:arr)
        {
            // if(hm.containsKey(i))//key
            // hm.put(i,hm.get(i)+1);
            // else
            // hm.put(i,1);
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i:hm.values())//values means counts
        {
            if(hs.contains(i))
            return false;
            else
            hs.add(i);
        }
        return true;
        //TC O(N) SC O(N)
    }
}