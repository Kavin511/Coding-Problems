As we know that every number >=2 can be represented as natural powers of primes(prime factorization). Also prime factorization is unique for a number. 

Eg. 360 = 233251

Today we are interested in geek numbers. A geek number is a number whose prime factorization only contains powers of unity.Below are some geek numbers.

Eg. 2 = 21
    22 = 21111

Example 1:

Input: N = 22
Output: Yes
Explaination: 22 = 21111. Where all the 
powers of prime numbers are one.
Example 2:

Input: N = 4
Output: No
Explaination: 4 = 22. Where all the 
powers of all the prime are not one.
Your Task:
You do not need to read input or print anything. Your task is to complete the function geekNumber() which takes N as input parameter and returns 1 if it a geek number. Otherwise, returns 0.

Expected Time Complexity: O(sqrt(N))
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 106  

solution 1:
class Solution{
    static int geekNumber(int n){
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            int count=0;
            int temp=n;
            while(temp%i==0)
            {
                
               count++;
              if(count>1)
            return 0;
            temp/=i;
             }
        }
        return 1;
    }
  
}