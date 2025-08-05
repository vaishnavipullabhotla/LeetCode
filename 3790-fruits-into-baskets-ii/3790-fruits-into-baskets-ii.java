class Solution 
{
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) 
    {
        int n = fruits.length;
        boolean a[] = new boolean[n];
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(fruits[i] <= baskets[j] && a[j]==false)
                {
                    a[j] = true;
                    cnt++;
                    break;
                }
            }
        }
        return n-cnt;
    }
}