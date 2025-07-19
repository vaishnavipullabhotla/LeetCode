class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<n;i++){
            long pow=(long)Math.pow(3,i);
            if((long)n==pow)
            return true;
            if(pow>n)
            break;
        }
        return false;
    }
}