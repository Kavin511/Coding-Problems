Given an array arr of size N, the goal is to find out the smallest number that is repeated exactly ‘K’ times.

Input Format

5 2 2 2 1 3 1

Constraints

nil

Output Format

1

Sample Input 0

5
2
2 2 1 3 1 
Sample Output 0

1
Explanation 0

Here in array, 2 is repeated 2 times, 1 is repeated 2 times, 3 is repeated 1 time. Hence 2 and 1 both are repeated 'k' times i.e 2 and min(2, 1) is 1 .
Solution 1:
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
   int n=s.nextInt();
   int k=s.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
       arr[i]=s.nextInt();
   }
   Arrays.sort(arr);
   int count=1;
   int flag=0;
   for(int i=1;i<n;i++)
   {
       if(arr[i]==arr[i-1])
       count++;
       else{
           if(count==k)
           {
               flag=1;
               System.out.println(arr[i-1]);
               break;
           }
           else{
               count=1;
           }
           
       }
   }
   if(flag==0&&count==k)
   {
       System.out.println(arr[n-1]);
   }
   else if(flag==0)
       System.out.println(-1);
   
   
  }
}
