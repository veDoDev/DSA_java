//{ Driver Code Starts
// Initial Template for C
#include <stdbool.h>
#include <stdio.h>
#include <string.h>


// } Driver Code Ends
// User function Template for C

bool areAnagrams(char s1[], char s2[]) {
    int sum1 = 0, sum2 = 0,i;
    unsigned long long mult1 = 1, mult2 = 1;

    if(strlen(s1) == strlen(s2))
    {
        for(i = 0; i<strlen(s1); i++)
        {
            sum1 += s1[i];
            sum2 += s2[i];
            mult1 *= s1[i];
            mult2 *= s2[i];
        }
        if(sum1 == sum2 && mult1 == mult2)
            return true;
        else
            return false;
    }
    return false;
}


//{ Driver Code Starts.

int main() {
    int t;
    scanf("%d\n", &t);

    while (t--) {
        // Dynamically allocate memory for strings
        char *c = (char *)malloc(100005 * sizeof(char));
        char *d = (char *)malloc(100005 * sizeof(char));

        // Input the strings
        scanf("%s\n", c);
        scanf("%s\n", d);
        // Check if they are anagrams and print the result
        if (areAnagrams(c, d))
            printf("true\n");
        else
            printf("false\n");
        printf("%s\n", "~");

        // Free the allocated memory
        free(c);
        free(d);
    }

    return 0;
}

// } Driver Code Ends
