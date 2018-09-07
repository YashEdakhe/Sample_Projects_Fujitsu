import java.util.Scanner;

public class StudentTest {

	static Student student[];
	static int student_count;

	static Student getInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter id,name and Marks of 3 Subjects");
		
		int std_id = scan.nextInt();
		
		scan.nextLine();
		String std_name = scan.nextLine();
		int mark_1 = scan.nextInt();
		int mark_2 = scan.nextInt();
		int mark_3 = scan.nextInt();
		scan.nextLine();
		

		int result = calculatePercentage(mark_1, mark_2, mark_3);
		
		String grade = calculateGrade(result);

		Student student = new Student(std_id, std_name, mark_1, mark_2, mark_3, result, grade);
		return student;

	}

	private static int calculatePercentage(int m1, int m2, int m3) {
		int total = ((m1 + m2 + m3)*100/300);
		
		return total;
	}

	private static String calculateGrade(int result) {
		if (result < 100 && result >= 80) {
			return "A";
		} else if (result < 80 && result >= 60) {
			return "B";
		} else if (result < 60 && result >= 45) {
			return "C";
		} else {
			return "Fail";
		}
	}

	static void add(Student students) {

		student[student_count] = students;
		student_count++;
		/*for (Student s : student){
		System.out.println(s);
		}*/
		
	}

	static void view() {
		for (Student s : student) {
			System.out.println(s);
		}
	}
	
	static void viewByID(int i){
		{
			
			for(Student s : student)
				if(i==s.getStudent_id())
				{
					System.out.println(s);
				}
		}
	}
	

	public static void main(String args[]) {
		int s=0,r=0;
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		
		do{
			System.out.println("Enter Your Choice");
			System.out.println("1.Enter Student Record");
			System.out.println("2.Enter ID to Search Student Record");
			System.out.println("3.Display All Records");
			choice = scanner.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter number of student details to be entered less than 5");
				int count = scanner.nextInt();
				student= new Student[count];
				for (int i = 0; i < count; i++)
				{	
					add(getInfo());
				}
				break;
			case 2:
				System.out.println("Enter Student ID ");
				s =  scanner.nextInt();
				viewByID(s);
				break;
			case 3:
				view();
				break;
			default:
					System.out.println("Wrong Choice!");
					System.exit(0);
		}
		System.out.println("Press 1 to Continue!");
		r=scanner.nextInt();
		}while(r==1);
		
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of student details to be entered less than 5");
		int count = scanner.nextInt();
		student= new Student[count];
		
		for (int i = 0; 2i < count; i++) {
			
			add(getInfo());
		}
		view();*/
	}
}
