class Solution 
{
    public int maximum69Number (int num) 
    {
        int k = num, cnt = 0;
        while(k > 0)
        {
            cnt++;
            k = k/10;
        }
        int a[] = new int[cnt];
        k = num;
        int x = cnt-1;
        while(k > 0 && x >= 0)
        {
            a[x--] = k % 10;
            k = k / 10;
        }
        for(int i=0;i<cnt;i++)
        {
            if(a[i] == 6)
            {
                a[i] = 9;
                break;
            }
        }
        int n = 0;
        for(int i:a)
        {
            n = n * 10 + i;
        }
        return n;
    }
}