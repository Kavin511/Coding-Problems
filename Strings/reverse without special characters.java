import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String temp[]=str.split("[\"]");
      str=temp[1];
      
      Stack<Character> stck=new Stack<Character>();
      for(int i=0;i<str.length();i++)
      {
        if((str.charAt(i)-'A'>=0&&str.charAt(i)-'Z'<=26)||(str.charAt(i)-'a'>=0&&str.charAt(i)-'z'<=26))
          stck.add(str.charAt(i));
      }
      
      for(int i=0;i<str.length();i++)
      {
        if(((str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')))
          str=str.substring(0,i)+stck.pop()+str.substring(i+1);
      }
      System.out.println(str);
      
    }
   
}
 
 
