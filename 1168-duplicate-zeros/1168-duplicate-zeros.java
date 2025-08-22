class Solution 
{
    public void duplicateZeros(int[] arr) 
    {
        int n = arr.length;
        int temp[] = new int[n];
        int idx = 0;
        for(int i=0;i<n && idx<n;i++)
        {
            if(arr[i] == 0)
            {
                temp[idx++] = 0;
                if(idx < n)
                temp[idx++] = 0;
            }
            else
            {
                temp[idx++] = arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i] = temp[i];
        }
    }
}