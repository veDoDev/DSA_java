class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) 
    {
        int n = asteroids.length;

        Arrays.sort(asteroids);
        long afterMass = mass;

        for(int x : asteroids)
        {
            if(afterMass >= x)
                afterMass += x;
            else
                return false;
        }

        return true;
    }
}
