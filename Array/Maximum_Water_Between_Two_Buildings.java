class Solution {
    public int maxWater(int[] height) 
    {
        int n = height.length;
        int head = n-1;
        int tail = 0;
        int area = Math.min(height[head], height[tail])*(head - tail - 1);
        
        while(tail <= head)
        {
            if(height[head] <= height[tail])
                head--;
            else
                tail++;
            if(head > 0 && tail < n)
                area = Math.max(area, Math.min(height[head], height[tail])*(head - tail - 1));
            // System.out.println(tail + " " + head + " : " + area);
        }
        
        return area;
    }
}
