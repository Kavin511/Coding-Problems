// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

// Find the kth positive integer that is missing from this array.

 

// Example 1:

// Input: arr = [2,3,4,7,11], k = 5
// Output: 9

// Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
// Example 2:

// Input: arr = [1,2,3,4], k = 2
// Output: 6
// Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.

// Solution 1:
import java.util.*;
class Solution {
    public int findKthPositive(int[] arr, int k) {
      
        int left = 0;
        int right = arr.length-1;
        
        while(left <= right) {
            int mid = left + (right - left)/2;
            
            if(arr[mid] - (mid + 1) >= k) right = mid-1;
            else left = mid + 1;
            
        }
        
        return left + k;
    }
}
// Solution 2:
class Solution2 {
    public int findKthPositive(int[] arr, int k) {
        int count=0,i=0,start=0;
         ArrayList<Integer> missing=new ArrayList<Integer>();
        while(missing.size()<k)
        {
            if(i<arr.length)
            {
                if(arr[i]!=start+1)
                {
                    for(int j=start+1;j<arr[i];j++)
                    {
                        missing.add(j);                   
                        System.out.print(j);
                    }
                    System.out.println();
                }                             
                start=arr[i];
                i++;   
            }
            else
            {            
                start++;
                missing.add(start);             
            }
        }
        
        return missing.get(k-1);
    }
}
