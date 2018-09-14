package fujitsu.project2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Employee_Data {

	private int employee_ID;
	private String employee_Name;
	private String designation;
	private double salary;
	private double pF;
	private double ctc;
	
	Scanner scan = new Scanner(System.in);
	public Employee_Data(int employee_ID, String employee_Name, String designation, double salary, double pF,
			double ctc) {
		super();
		this.employee_ID = employee_ID;
		this.employee_Name = employee_Name;
		this.designation = designation;
		this.salary = salary;
		this.pF = pF;
		this.ctc = ctc;
	}
	public int getEmployee_ID() {
		return employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}
	public String getEmployee_name() {
		return employee_Name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_Name = employee_name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getpF() {
		return pF;
	}
	public void setpF(double pF) {
		this.pF = pF;
	}
	public double getCtc() {
		return ctc;
	}
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
	
	static ArrayList<Employee_Data> employeeList = new ArrayList<>();
	public static void addEmployee(){
		
		System.out.println("Enter Employee ID,Name,Designation and ctc");
		Scanner scan = new Scanner(System.in);
		int  employee_ID = scan.nextInt();
		String employee_Name = scan.next();
		String designation =  scan.next();
		double ctc = scan.nextDouble();
		 
		 double salary = calculate_Salary(ctc);
		 double pF =  calculate_PF(ctc); 
		 
		 Employee_Data ed = new Employee_Data(employee_ID,employee_Name,designation,ctc,salary,pF);
		 employeeList.add(ed);
	} 
	
	
	public	static void deleteEmployee()
	{
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		Iterator ir = employeeList.iterator();
		while(ir.hasNext())
		{
			Employee_Data ed = (Employee_Data)ir.next();
			if(ed.employee_ID==id)
			{
				ir.remove();
				break;
			}
		}
		System.out.println("Record Deleted Successfully");
	}
	
	public	static void updateEmployee()
	{
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		String name = scan.next();
		Iterator ir = employeeList.iterator();
		while(ir.hasNext())
		{
			Employee_Data ed = (Employee_Data)ir.next();
			if(ed.getEmployee_ID()==id)
			{
				ed.setEmployee_name(name);
				break;
			}
		}
		System.out.println("Name Updated Successfully");
	}
	
	public	static void findAll(){
		for(Employee_Data eds:employeeList)
		{
			System.out.println(eds);
		}
	}
	
	public	static void findByID()
	{
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		boolean value = false;
		Iterator ir = employeeList.iterator();
		while(ir.hasNext())
		{
			Employee_Data ed = (Employee_Data)ir.next();
			if(ed.getEmployee_ID()==id)
			{
				value = true;
				System.out.println("ID Exist");
				break;
			}
			else
			{
				System.out.println("ID NOT FOUND");
			}
		}
	}
	
	
	public static double calculate_Salary(double ctc) {
		double result1 = (ctc/100) * 40;
		double result2 = calculate_PF(ctc);
		return result1+result2;
	}
	public static double calculate_PF(double ctc)
	{
		double result2 = (ctc/100)*20; 
		return result2;
	}
	
	
	@Override
	public String toString() {
		return "Employee_Data [employee_ID=" + employee_ID + ", employee_name=" + employee_Name + ", designation="
				+ designation + ", salary=" + salary + ", pF=" + pF + ", ctc=" + ctc + "]";
	}
	
}
