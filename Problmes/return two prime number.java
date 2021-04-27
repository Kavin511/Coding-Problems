import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int j=2,k=n-2;j<=k;j++,k--)
      {
        if(isPrime(j)&&isPrime(k))
        {
           System.out.println(j+" "+k);
          break;
        } 
        
      }
      
    }
  static boolean  isPrime(int n)
  {
    for(int i=3;i<n/2;i++)
      if(n%i==0)
        return false;
    return true;
  }
}
 
 
