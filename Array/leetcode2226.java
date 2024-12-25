long pplGettingCandies(int* candies, int candiesSize, int candyAlloc)
{
    long tempAlloc = 0;

    for (int i = 0; i < candiesSize; i++)   tempAlloc += candies[i] / candyAlloc;

    return tempAlloc;
}

int maximumCandies(int* candies, int candiesSize, long long k)
{
    long long totalCandies = 0;
    for (int i = 0; i < candiesSize; i++)   totalCandies += candies[i];


    int leastCandies = 1, maxCandies = totalCandies / k;
    int result = 0;

    while (leastCandies <= maxCandies)
    {
        int candyAlloc = (leastCandies + maxCandies) / 2;

        if (pplGettingCandies(candies, candiesSize, candyAlloc) >= k)
        {
            result = candyAlloc; 
            leastCandies = candyAlloc + 1;
        }
        else
        {
            maxCandies = candyAlloc - 1;
        }
    }

    return result;
}
