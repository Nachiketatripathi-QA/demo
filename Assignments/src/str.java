import java.util.Scanner;
/**
 * Program for reversing the string keeping place of special characters fixed
 * @author nachiketatripathi
 *
 */
public class str {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Please Enter the String ");
	    char[] a=sc.next().toCharArray();
	    reverse(a);
	}

	public static Boolean alpha(char x)
	{
	  boolean b;
	  b=  ( (x >= 65 &&  x <= 90) || (x >= 97 &&  x <= 122) );
	  return b;
	}
	 
	
	public static void reverse(char s[])
	{
	    int r = (s.length - 1), l = 0;
	    while (l < r)
	    {
	        if (!alpha(s[l]))
	            l++;
	        else if(!alpha(s[r]))
	            r--;
	        else 
	        {
	        	char temp=s[r];
	        	s[r]=s[l];
	        	s[l]=temp;
	          
	            l++;
	            r--;
	        }
	    }
	    
	    for(int i=0;i<s.length;i++)
	    	System.out.print(s[i]);
	}
}
