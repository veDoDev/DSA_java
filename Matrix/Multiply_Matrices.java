/*Complete the function below*/
class GfG {
    public static void multiply(int mat1[][], int mat2[][], int result[][], int N) 
    {
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                int curr = 0;
                for(int k = 0; k < N; k++)
                    curr += mat1[i][k]*mat2[k][j];
                    
                result[i][j] = curr;
            }
        }
    }
}
