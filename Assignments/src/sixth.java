import java.util.Scanner;

/**
 * Sample program for sorting
 * @author nachiketatripathi
 *
 */
public class sixth {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
	int a[]= new int[n];
	int temp;
	 for(int i=0;i<n;i++)
	 {
		 a[i]=sc.nextInt();
	 }
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
		
		}
			
		System.out.println("Sorted array ");
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
		
	}

}
