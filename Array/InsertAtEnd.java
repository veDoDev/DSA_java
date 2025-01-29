//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Array {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//taking testcases
		int testcases=sc.nextInt();
		while(testcases-->0)
		{
		    //input size of Array
		    int sizeOfArray=sc.nextInt();
		    
		    int arr[]=new int[sizeOfArray];
		    
		    //inserting elements in the array
		    for(int i=0;i<sizeOfArray-1;i++)
		    {
		        int x;
		        x=sc.nextInt();
		        arr[i]=x;
		    }
		    
		    //input element to be inserted
		    int element=sc.nextInt();
		    
		    Insert obj=new Insert();
		    
		    //calling insertAtEnd() function
		    obj.insertAtEnd(arr,sizeOfArray,element);
		    
		    //printing the elements of the array
		    for(int i=0;i<sizeOfArray;i++)
		    {
		        System.out.print(arr[i]+" ");
		        
		    }
		    
		    System.out.println();
		
System.out.println("~");
}
	}
}



// } Driver Code Ends
//User function Template for Java

class Insert
{
    public void insertAtEnd(int arr[],int sizeOfArray,int element)
    {
        arr[sizeOfArray - 1] = element;
        return;
    }
}

//{ Driver Code Starts.


// } Driver Code Ends
