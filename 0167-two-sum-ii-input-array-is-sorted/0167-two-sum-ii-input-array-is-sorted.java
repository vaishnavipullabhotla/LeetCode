class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int n = numbers.length;
        int a[]=new int[2];
        int l=0,r=n-1;
        while(l<r)
        {
            int sum = numbers[l]+numbers[r];
            if(sum==target)
            {
                a[0]=l+1;//as it is 1 indexed array
                a[1]=r+1;//as it is 1 indexed array
                return a;
            }
            else if(sum < target) l++;
            else r--;
        }
        return a;
    }
}