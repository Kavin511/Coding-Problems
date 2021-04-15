Given two sorted arrays(arr1[] and arr2[]) of size M and N of distinct elements. Given a value Sum. The problem is to count all pairs from both arrays whose sum is equal to Sum.

M=4, N=4 , Sum = 10 arr1[] = {1, 3, 5, 7} arr2[] = {2, 3, 5, 8}

Input Format

4 4 10 1 3 5 7 2 3 5 8

Constraints

nil

Output Format

2

Sample Input 0

4
4 
10
1 3 5 7
2 3 5 8
Sample Output 0

2
Explanation 0

The pairs are: (5, 5) and (7, 3).
solution 1:

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Solution
{
  public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   int m=s.nextInt();
   int n=s.nextInt();
   int sum=s.nextInt();
   int arr1[]=new int[m];
   int arr2[]=new int[n];
   for(int i=0;i<m;i++){
       arr1[i]=s.nextInt();
   }
   for(int i=0;i<m;i++){
       arr2[i]=s.nextInt();
   }
   int count=0;
   for(int i=0;i<m;i++)
   {
       for(int j=0;j<n;j++)
       {
           if(arr1[i]+arr2[j]==sum)
           count++;
       }
   }
   System.out.println(count);
  }
}
