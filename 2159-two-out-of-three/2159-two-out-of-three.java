class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n3=nums3.length;
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                for(int k=0;k<n3;k++){
                    if(nums1[i]==nums2[j] && !a.contains(nums1[i]))
                    a.add(nums1[i]);
                    else if(nums2[j]==nums3[k] && !a.contains(nums2[j]))
                    a.add(nums2[j]);
                    else if(nums1[i]==nums3[k] && !a.contains(nums3[k]))
                    a.add(nums3[k]);
                }
            }
        }
        return a;
    }
}