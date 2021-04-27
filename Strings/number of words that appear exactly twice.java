Given a list of N words. Count the number of words that appear exactly twice in the list.

Input Format

8 Tom Jerry Thomas Tom Jerry Courage Tom Courage

Constraints

nil

Output Format

2

Sample Input 0

8
Tom Jerry Thomas Tom Jerry Courage Tom Courage
Sample Output 0

2
Explanation 0

Jerry Courage
Solution :
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
   String[] arr=new String[n];
   for(int i=0;i<n;i++)
   {
       arr[i]=s.next();
   }
   Arrays.sort(arr);
   int count=0,tempcount=1;
   for(int i=1;i<n;i++)
   {
       if(arr[i].equals(arr[i-1]))
       {
           tempcount++;
       }
       else
       {
           if(tempcount==2)
           count++;
           tempcount=1;
       }
   }
   if(tempcount==2)
   {
       count++;
   }
   System.out.println(count);
  }
}
