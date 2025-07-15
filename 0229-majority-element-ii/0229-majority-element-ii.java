class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt=0;
            if(l.contains(nums[i])) continue;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt>n/3)
            l.add(nums[i]);
        }
        return l;
    }
}