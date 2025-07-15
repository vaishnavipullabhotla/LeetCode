class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] temp=new String[n];
        // if(n==1){
        //     temp[0]="Gold Medal";
        //     return temp;
        // }
        for(int i=0;i<n;i++){
            // int cnt=0;
            int cnt=0;
            for(int j=0;j<n;j++){
                if(score[j]>=score[i]){
                    cnt++;
                }
            }
            if(cnt==1) temp[i]="Gold Medal";
            else if(cnt==2) temp[i]="Silver Medal";
            else if(cnt==3) temp[i]="Bronze Medal";
            // else if(cnt==4) temp[i]="Silver Medal";
            // else if(cnt==5) temp[i]="Gold Medal";
            else temp[i]=String.valueOf(cnt);
        }
        return temp;
    }
}