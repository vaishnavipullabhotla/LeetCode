class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        // int i=0,j=i+1;
        // while(i<j && j<n){
        //     if((nums[i]>0 && nums[j]<0) || (nums[i]<0 && nums[j]>0)){
        //         int temp=nums[i];
        //         nums[i]=nums[j];
        //         nums[j]=temp;
        //     }
        //     if(nums[i]>0 && nums[j]>0){
        //         i++;
        //         j++;
        //     }
        //     else
        //     break;
        // }
        int pos[]=new int[n];
        int neg[]=new int[n];
        int cnt1=0,cnt2=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0)
            pos[cnt1++]=nums[i];
            else
            neg[cnt2++]=nums[i];
        }
        int cnt=0;
        cnt1=0;
        cnt2=0;
        for(int i=0;i<n;i=i+2){
            nums[cnt++]=pos[cnt1++];
            nums[cnt++]=neg[cnt2++];
        }
        return nums;
    }
}