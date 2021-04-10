Given a stack with push(), pop(), empty() operations, delete the middle of the stack without using any additional data structure.

Input Format

1 2 3 4 5

Constraints

nil

Output Format

1 2 4 5

Sample Input 0

1 2 3 4 5
Sample Output 0

1 2 4 5
Solution:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String arr[]=str.split(" ");
    for(int i=0;i<arr.length;i++)
    {
    if(i!=arr.length/2)
    System.out.print(arr[i]+" ");
    }
    }
}