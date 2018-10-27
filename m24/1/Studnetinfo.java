class Studentinfo {

	int roll_number;
	String student_name;
	double total_marks;

	Studentinfo(int roll_number, String student_name, double total_marks) {
		this.roll_number = roll_number;
		this.student_name = student_name;
		this.total_marks = total_marks;

	}

	public int getrollNum(int roll_number) {
		return this.roll_number;
	}

	public String getStudentname(String student_name) {
		return this.student_name;
	}

	public double getTotalmarks(double total_marks) {
		return this.total_marks;
	}

	public void setRollnum(int roll_number) {
		this.roll_number = roll_number;
	}

	public void setStudentname(String student_name) {
		this.student_name = student_name;
	}

	public void setTotalmarks(double total_marks) {
		this.total_marks = total_marks;
	}
}


