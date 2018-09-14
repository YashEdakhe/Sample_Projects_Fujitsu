package fujitsu.project2;
import java.util.ArrayList;
import java.util.Scanner;
//import fujitsu.project2.Employee_Data;

public class Employee_Data_Test {
	static ArrayList<Employee_Data> employeeList = new ArrayList<>();
	static int choice = 0;
	public static void main(String args[])
	{
	
while(true){
	Scanner scan = new Scanner(System.in);
	System.out.println("...Enter Choice...");
	System.out.println(" 1.ADD EMPLOYEE DETAILS.\n 2.UPDATE EMPLOYEE DETAILS\n 3.Display EMPLOYEE DETAILS\n 4.Display EMPLOYEE DETAILS by ID\n 5.Delete EMPLOYEE DETAILS\n");
	choice = scan.nextInt();
	switch(choice)
	{
	case 1 : Employee_Data.addEmployee();
			System.out.println("Record Added Successfully");
			break;
	case 2 :System.out.println("Enter ID and Name");
			Employee_Data.updateEmployee();	
			break;
	case 3 : Employee_Data.findAll();
			break;
	case 4: System.out.println("Enter ID");
			Employee_Data.findByID();
			break;
	case 5:
		System.out.println("Enter ID");
		Employee_Data.deleteEmployee();
			break;
	default:
			break;
	}
}
	}
}
