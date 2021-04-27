// A Program to check if strings are rotations of each other or not
// Difficulty Level : Medium
// Last Updated : 06 Nov, 2020
// Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1?
// (eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      String str1=s.nextLine();
      String str2=s.nextLine();
      System.out.println(((str1+str1).contains(str2)&&str1.length()==str2.length())?"Yes":"No");
    }
}