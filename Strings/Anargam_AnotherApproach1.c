//{ Driver Code Starts
// Initial Template for C
#include <stdbool.h>
#include <stdio.h>
#include <string.h>


// } Driver Code Ends
//Back-end complete function Template for C

bool areAnagrams(char str1[], char str2[]) {
    // an array of size 26, to store count of characters.
    int a[26] = {0};

    // if the lengths of the strings are not equal, they can't be anagrams
    if (strlen(str1) != strlen(str2)) {
        return false;
    }

    // storing count of each character in the first string.
    for (int i = 0; str1[i] != '\0'; i++) {
        a[str1[i] - 'a']++;
    }

    // decrementing the count of characters encountered in the second string.
    for (int i = 0; str2[i] != '\0'; i++) {
        a[str2[i] - 'a']--;
    }

    // checking if the count of every character is zero
    for (int i = 0; i < 26; i++) {
        if (a[i] != 0) {
            return false;
        }
    }

    return true;
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
