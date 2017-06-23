import java.util.Scanner; 
/**
 * Learning use of Data members and methods
 * @author nachiketatripathi
 *
 */

public class person {
    private int age;

    public person(int initialAge) {
    
    if (initialAge <0) {
                         System.out.println("Age is not valid, Setting age to 0");
                         initialAge = 0;
                   } else {
                          age = initialAge;
                   }
    }
    /*
     * Increases the age of person as year passes
     */
    
    public void yearPasses()
       {
            age++;
        }
    /*
     *Tells the current State o fa person
     */
    public void amIOld() {
    
    if (age < 13) {
                         System.out.println("You are YOUNG");
                     }
                    else if (age >= 13 && age < 18) {
                             System.out.println("You are a TEENAGER");
                    }
                    else {
                             System.out.println("You are OLD");
                    }

    }

    public static void main(String args[])
     { 
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter your Age:");
    	int age=sc.nextInt();
    	person p = new person(age);
    	p.amIOld();
    	p.yearPasses();
    	p.yearPasses();
    	p.yearPasses();
    	p.yearPasses();
    	p.yearPasses();
    	p.yearPasses();
    	p.yearPasses();
    	p.yearPasses();
    	p.yearPasses();
    	p.yearPasses();
    	p.yearPasses();
    	p.yearPasses();
    	p.yearPasses();
    	System.out.println("After 13 years: ");
    	p.amIOld();
    	
      }
    
    }