// Rotation of numbers until the number is palindrome
// input :123
// output:444
// Solution:
import java.io.*;
import java.util.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        while(true)
        {
            int total=Integer.parseInt(str)+Integer.parseInt(reverse(str));
            if(String.valueOf(total).equals(reverse(String.valueOf(total))))
            {
                System.out.println(total);
                break;                
            }
            else{
                str=String.valueOf(total);
            }
        }       
    }
    static String reverse(String val)
    {
        StringBuilder str=new StringBuilder(val);
        return new String(str.reverse());
    }
}