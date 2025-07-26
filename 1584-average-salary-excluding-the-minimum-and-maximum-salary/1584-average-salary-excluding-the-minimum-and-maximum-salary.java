class Solution 
{
    public double average(int[] salary) 
    {
        int n=salary.length;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            min = Math.min(min,salary[i]);
            max = Math.max(max,salary[i]);
        }
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            if(salary[i]!=min && salary[i]!=max)
            sum += salary[i];
        }
        return (double)sum/(n-2);
    }
}