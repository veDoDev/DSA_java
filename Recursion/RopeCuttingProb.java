public class RopeCuttingProb {
    public static void main(String[] args) {
        int num = cutRope(9,2,2,2,0);                 //Sample call
        System.out.println("The Optimal rope cuts are: "+num);
    }

    public static int cutRope(int n, int a, int b,int c,int count)
    {
        int res1,res2,res3;
        count++;
        
        if(n<0)
        {
            count = -1;
            return -1;
        }
        if(n == 0)
            return count-1;
        
        res1 = cutRope(n-a, a, b, c,count);
        res2 = cutRope(n-b,a,b,c,count);
        res3 = cutRope(n-c,a,b,c,count);
        
        if (res1 < 0 && res2 < 0 && res3<0)
            return -1;

        count = maxOfTeen(res1,res2,res3);
        return count;

    }
    public static int maxOfTeen(int a, int b, int c)
    {
        if (a > b)
        {
            return Math.max(a, c);

        }
        return Math.max(b, c);
    }
}
