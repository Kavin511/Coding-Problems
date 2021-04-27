import java.util.*;
public class word_cross {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      for(int i=0;i<str.length();i++)
      {
        for(int j=0;j<str.length();j++)
        {
          if(i==j)
            System.out.print(str.charAt(i)+" ");          
          else if(i==(str.length()-1-j))
            System.out.print(str.charAt(str.length()-1-i)+" ");
          else
            System.out.print("  ");
          
        }
        System.out.println();
      }
      
    }
}
// input:
// program
// output:
// p           m 
//   r       a   
//     o   r     
//       g       
//     o   r     
//   r       a   
// p           m 
