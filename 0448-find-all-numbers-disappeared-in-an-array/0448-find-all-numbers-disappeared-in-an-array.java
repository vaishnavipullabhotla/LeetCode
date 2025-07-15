class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> a=new ArrayList<Integer>();
        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        for(int i=1;i<n+1;i++){
            if(!s.contains(i))
            a.add(i);
        }
        return a;
    }
}
//TC O(N)
//SC O(N)