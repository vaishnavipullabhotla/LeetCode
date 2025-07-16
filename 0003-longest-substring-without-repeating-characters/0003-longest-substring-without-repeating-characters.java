class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        StringBuilder st=new StringBuilder();
        int max=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(st.toString().contains(String.valueOf(ch))){
                while (st.toString().contains(String.valueOf(ch))) {
                    st.deleteCharAt(0);
                }
            }
            st.append(ch);
            max=Math.max(max,st.length());
        }
        return max;
    }
}