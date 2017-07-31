import java.util.*;
import java.util.ArrayList;

public class Compare implements Comparator {

	public static void main(String args[])
	{
		Compare c=new Compare();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the total number of the students");
		int totalNumber=sc.nextInt();
		ArrayList<Student> studentList= new ArrayList<Student>();
		System.out.println("Enter the information of the student"); 
		while(totalNumber>0)
		 {
			 
			 int id=sc.nextInt();
			 
			 String name=sc.next();
			 
			 double cgpa=sc.nextDouble();
			 
			 Student newEntry=new Student(id,name,cgpa);
			 studentList.add(newEntry);
			 
			 totalNumber--;	
		 }
		 Collections.sort(studentList,c);
		 for(Student st: studentList){
	         System.out.println(st.getName());
		 }
	}
	
	
	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		if (s1.getCGPA()==s2.getCGPA()) {
			if (s1.getName()==s2.getName()) {
				if (s1.getID() < s2.getID()) {
					return 1;
				}
				else {
					return -1;
				}
			}
			else {
				return s1.getName().compareTo(s2.getName());
			}
		}
		else if (s1.getCGPA() < s2.getCGPA()) {
			return 1;
		}
		else {
			return -1;
             }
      }
}

 class Student{
	 private int id;
	 private String name;
	 private double cgpa;
	 
	public Student(int id, String name, double cgpa)
	{
		super();
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
	}
	
	 public int getID(){return id;}
	 public String getName(){return name;}
	 public double getCGPA(){return cgpa;}


         public int getID1(){return id;}   //changes made for demo
	 public String getName1(){return name;} //changes made for demo
	 public double getCGPA1(){return cgpa;} //changes made for demo

	
}
