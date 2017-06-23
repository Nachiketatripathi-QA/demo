import java.util.Scanner;

/**
 * learnig concepts of type casting
 * @author nachiketatripathi
 *
 */
public class second {
	public static void main(String args[])
	{
		double mealCost, totalMealCost; int tipPercent, taxPercent;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Meal Cost:");
		 mealCost=sc.nextDouble(); 
		System.out.println("Enter Tip percentage:");
		 tipPercent=sc.nextInt(); 
		 System.out.println("Enter Tax Percentage:");
		taxPercent=sc.nextInt(); 
		 
		double a=tipPercent;
		double b=taxPercent;
		 totalMealCost=mealCost+ mealCost*(a/100)+ mealCost*(b/100);
		 System.out.println("Total Meal Cost is Rs. "+totalMealCost);
		
	}

}
