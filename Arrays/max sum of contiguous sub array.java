import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
      while(t-->0)
      {
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=s.nextInt();
        }
        int max=0;
        int sum=arr[0];
        for(int i=1;i<n;i++)
        {
          sum+=arr[i];
          max=Math.max(sum,max);
          if(sum<0)
            sum=0;
        }
        System.out.println(max);
      }
    }
   
}
 
 
