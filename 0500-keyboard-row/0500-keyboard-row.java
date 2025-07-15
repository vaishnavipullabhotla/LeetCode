class Solution {
    public String[] findWords(String[] words) {
        String fr="qwertyuiop";
        String sr="asdfghjkl";
        String tr="zxcvbnm";
        int n=words.length;
        String[] temp=new String[n];
        int idx=0;
        for(int i=0;i<n;i++){
            int cnt1=0,cnt2=0,cnt3=0;
            for(int j=0;j<words[i].length();j++){
                char ch=Character.toLowerCase(words[i].charAt(j));
                if(fr.contains(String.valueOf(ch)))
                cnt1++;
                else if(sr.contains(String.valueOf(ch)))
                cnt2++;
                else if(tr.contains(String.valueOf(ch)))
                cnt3++;
            }
            if(cnt1==words[i].length() || cnt2==words[i].length() || cnt3==words[i].length())
            temp[idx++]=words[i];
        }
        //res is to store not null values of temp
        String res[]=new String[idx];
        for(int i=0;i<idx;i++){
            res[i]=temp[i];
        }
        return res;
    }
}