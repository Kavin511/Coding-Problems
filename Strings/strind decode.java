// input:a2b3c1
// output:aabbbc

import java.util.*;
  class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      int num=0;
      char temp='0';
      String res="";
      for(int i=0;i<str.length();i++)
      {
       if(!Character.isDigit(str.charAt(i))) 
       {
         if(num!=0)
         {
          res+=(""+temp).repeat(num);
          num=0;
         }
         temp=str.charAt(i);         
       }
        else
        {
          num*=10;
          num+=(str.charAt(i)-'0');
        }
      }
      res+=(""+temp).repeat(num);
      System.out.println(res);
    }
}