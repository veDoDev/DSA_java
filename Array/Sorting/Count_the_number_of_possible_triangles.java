class Solution{
    public int countTriangles(int arr[]) 
    {
        int count = 0;
        int n = arr.length;
        Arrays.sort(arr);
        for(int thirdSide = n-1; thirdSide >= 2; thirdSide--)
        {
            int firstSide = 0;
            int secndSide = thirdSide-1;
        
            while(firstSide < secndSide)
            {
                int currSum = arr[firstSide] + arr[secndSide];
                if(currSum > arr[thirdSide])
                {
                    count += secndSide - firstSide;
                    secndSide--;
                }
                
                if(currSum <= arr[thirdSide])
                    firstSide++;
            }
        }
        
        return count;
    }
}
