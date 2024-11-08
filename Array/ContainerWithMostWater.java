class Solution {
    public int maxArea(int[] height) 
    {
        if (height.length < 2) return 0;
        int left = 0, right = height.length-1;
        int area = (right-left)*min(height[left],height[right]),tempArea;
        System.out.println("area :" + area);
        while(right > left)// two pointer approach
        {
            
            if(height[left] < height[right])    left++;
            
            else    right--;//increment right only if left bar is not lesser than right bar
            tempArea = (right-left)*min(height[left],height[right]);
            
           
            if(tempArea > area) area = tempArea;
            
        }
        return area;
    }
    public int min(int x, int y)
    {
        if(x<y) return x;
        return y;
    }
}
