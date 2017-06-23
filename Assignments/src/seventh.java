import java.util.Scanner;


/**
 * Program for finding prime factors of a given number 
 * @author nachiketatripathi
 *
 */
public class seventh {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the no");
		int n=sc.nextInt();
	     findPrimeFact(n);
		
	
	}
	/**
	 * calculating the prime factors 
	 * @param n
	 */

	 public static void findPrimeFact(int n)
		{
			while(n%2==0)
			{
				System.out.print("2 ");
				n=n/2;
			}
		
	 
	 
		for(int i=3;i<Math.sqrt(n);i=i+2)
		{
			while(n%i==0)
			{
				System.out.print(" "+i);
				n=n/i;
			}
		}
		 if(n>2)
			System.out.print(n + " ");
	 }
}