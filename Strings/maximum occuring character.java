Given a string str. The task is to find the maximum occurring character in the string str. If more than one character occurs the maximum number of time then print the lexicographically smaller character.

Input Format

output

Constraints

nil

Output Format

t

Sample Input 0

output
Sample Output 0

t
Explanation 0

t and u are the characters with the same frequency, but t is lexicographically smaller.
Solution1:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      HashMap<Character,Integer> map=new HashMap<Character,Integer>();
      char arr[]=str.toCharArray();
      Arrays.sort(arr);
      for(char i:arr)
      {
        if(map.containsKey(i))
        {
          map.put(i,map.get(i)+1);
        }
        else
        {
          map.put(i,0);
        }
      }
      int val=0;
      char req=' ';
      for(Map.Entry m:map.entrySet())
      {
        if(Integer.parseInt(m.getValue().toString())>val)
        {
        req=m.getKey().toString().charAt(0);
        val=Integer.parseInt(m.getValue().toString());
        }
        else if(Integer.parseInt(m.getValue().toString())==val)
        {
        
        if(req>m.getKey().toString().charAt(0))
        req=m.getKey().toString().charAt(0);
        //val=Integer.parseInt(m.getValue().toString());
        }
      }
      System.out.print(req);
    }
}