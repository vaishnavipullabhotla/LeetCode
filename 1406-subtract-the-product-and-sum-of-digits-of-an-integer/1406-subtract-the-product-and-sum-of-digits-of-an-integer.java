class Solution {
    public int subtractProductAndSum(int n) {
        int x=n;
        int prod=1,sum=0;
        while(x>0){
            int k=x%10;
            prod=prod*k;
            sum=sum+k;
            x=x/10;
        }
        return prod-sum;
    }
}