class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean isZero[][]=new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                isZero[i][j]=true;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isZero[i][j])
                {
                    for(int k=0;k<n;k++)
                    matrix[i][k]=0;
                    for(int k=0;k<m;k++)
                    matrix[k][j]=0;
                }
            }
        }
    }
}