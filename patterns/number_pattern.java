package patterns;

public class number_pattern {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		int j=n;
		for(j=n;j>=n-i;j--)
		{
		System.out.print(j);
		}
		j++;
		for(int k=2*i+1;k<2*n-1;k++)
		{
		System.out.print(j);
		}
		for(j=n-i+1;j<=n;j++)
		System.out.print(+j);
		System.out.println();    
		}
        for(int i=n-2;i>=0;i--)
        {
            int j=n;
            for(;j>=n-i;j--)
                System.out.print(j);
            j++;
            for(int k=2*i+1;k<2*n-1;k++)
            {
                System.out.print(j);
            }
            for(j++;j<=n;j++)
                System.out.print(j);
            System.out.println();
        }        
	}
}
// input:
// 5
// output:
// 555555555
// 544444445
// 543333345
// 543222345
// 543212345
// 543222345
// 543333345
// 544444445
// 555555555