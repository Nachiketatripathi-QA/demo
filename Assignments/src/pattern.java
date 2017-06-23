import java.util.Scanner;
/**
 * Spiral Pattern
 * (Incomplete)
 * @author nachiketatripathi
 *
 */

public class pattern {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Row size");
		int m=sc.nextInt();
		System.out.println("Enter Column size");
		int n=sc.nextInt();
		
     	int a[][]= new int[m][n];
     	int b[]=new int[m*n];
		System.out.println("Enter Matrix elements");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		//int i,k=0,l=0;
	//	while(k<m && l<n)
	//	{
			//for(i=l;i<n;++i)
				//System.out.println(a[][]);
				
			
	//	}
		 
		 
		 
		 for(int i=0;i<(m*n);i++)
		System.out.println(b[i]);
	}

}
