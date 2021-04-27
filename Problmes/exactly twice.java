Given a list of N words. Count the number of words that appear exactly twice in the list.

Input Format

3 Geeks For Geeks

Constraints

nil

Output Format

1

Sample Input 0

3
Geeks For Geeks
Sample Output 0

1
Solution 1:
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String arr[]=new String[n];
        HashMap<String,Integer> map=new HashMap<String,Integer>();        
        for(int i=0;i<n;i++)
        {
          String temp=s.next();
          if(map.containsKey(temp))
          {
          map.put(temp,map.get(temp)+1);
          }
          else
          {
          map.put(temp,1);
          }
        }
        int count=0;
        for(HashMap.Entry<String,Integer> m:map.entrySet())
        {
          if(Integer.parseInt(m.getValue().toString())==2)
          count++;
        }
        System.out.println(count);
        
    }
}