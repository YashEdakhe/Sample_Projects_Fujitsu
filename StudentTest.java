import java.util.Scanner;

public class StudentTest {
	
	static Student student[] = new Student[3];
	
	static Student getInfo()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name,ID and Marks of 3 Subjects");
		
		String 	std_name = scan.nextLine();
		int 	std_id 	= scan.nextInt();
		int 	mark_1 = scan.nextInt();
		int 	mark_2 = scan.nextInt();
		int 	mark_3 = scan.nextInt();
		
		scan.close();
		
		int result =  calculatePercentage(mark_1,mark_2,mark_3);
		String grade = calculateGrade(result);
	
		Student student = new Student(std_id,std_name,mark_1,mark_2,mark_3);
		return student;
		
		
	}
	
	private static int calculatePercentage(int m1,int m2, int m3)
	{
		int total 			= m1+m2+m3;
		int percentage 	= ((total/300)*100) ;
		return percentage;
	}
	
	private static String calculateGrade(int result)
	{
		if(result < 100 && result >= 80)	
		{
			return "A";
		}	
		else if(result < 60 && result >= 79)
		{
			return "B";
		}	
		else if(result < 40 && result >= 59)
		{
			return "C";
		}	
		else 
		{
			return "Fail";
		}	
	}	
	static void view()
	{
		for(Student s: student)
		{
			System.out.println(s);
		}
	}
		
	
}

