class Solution {
    public List<String> letterCombinations(String digits) {
        int n=digits.length();
        if(n==0) return new ArrayList<>();
        String a[]=new String[100];
        for(int i=0;i<n;i++){
            char ch=digits.charAt(i);
            if(ch=='2')
            a[i]="abc";
            else if(ch=='3')
            a[i]="def";
            else if(ch=='4')
            a[i]="ghi";
            else if(ch=='5')
            a[i]="jkl";
            else if(ch=='6')
            a[i]="mno";
            else if(ch=='7')
            a[i]="pqrs";
            else if(ch=='8')
            a[i]="tuv";
            else if(ch=='9')
            a[i]="wxyz";                 
        }
        List<String> l=new ArrayList<>();
        l.add("");
        for(int i=0;i<n;i++){
            List<String> temp=new ArrayList<>();
            for(String s:l) {
                for(int j=0;j<a[i].length();j++){
                    temp.add(s+a[i].charAt(j));
                }
            }
            l=temp;
        }
        return l;
    }
}