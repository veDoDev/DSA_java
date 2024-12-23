int findTheWinner(int n, int k) 
{
    if(n==1)    return n;
    int lastLeft = (k%n) + findTheWinner(n-1,k);
        
    if (lastLeft > n)  return lastLeft%n;
    return lastLeft;
    
}
