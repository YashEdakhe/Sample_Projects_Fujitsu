public class Student {

	private int student_id;
	private String student_name;
	private int mark1;
	private int mark2;
	private int mark3;
	private float percentage;
	private String grade;

	

	public Student(int student_id, String student_name, int mark1, int mark2, int mark3, float percentage,
			String grade) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.percentage = percentage;
		this.grade = grade;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

	@Override
	public String toString() {
		return "Student [student_name=" + student_name + ", student_id=" + student_id + ", mark1=" + mark1 + ", mark2="
				+ mark2 + ", mark3=" + mark3 + ", percentage=" + percentage + ", grade=" + grade + "]";
	}

}
